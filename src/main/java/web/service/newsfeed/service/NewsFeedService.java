package web.service.newsfeed.service;

import org.springframework.stereotype.Service;
import web.service.newsfeed.model.Comment;
import web.service.newsfeed.model.Post;
import web.service.newsfeed.model.Status;
import web.service.newsfeed.repository.CommentsRepository;
import web.service.newsfeed.repository.PostsRepository;
import web.service.newsfeed.repository.SharesRepository;
import web.service.newsfeed.rpc.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsFeedService {

    private final PostsRepository postRepository;
    private final CommentsRepository commentRepository;
    private final SharesRepository sharesRepository;
    private final FollowClientRpc followClientRpc;
    private final UserClientRpc userClientRpc;

    public NewsFeedService(PostsRepository postRepository, CommentsRepository commentRepository, SharesRepository sharesRepository, FollowClientRpc followClientRpc, UserClientRpc userClientRpc) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.sharesRepository = sharesRepository;
        this.followClientRpc = followClientRpc;
        this.userClientRpc = userClientRpc;
    }

    private web.service.newsfeed.rpc.Post getNewPostUser(String userId) {
        Post post = postRepository.findFirstByUserIdOrderByPostTimeDesc(userId);
        if(post != null) {
            web.service.newsfeed.rpc.Post.Builder rpcPost = web.service.newsfeed.rpc.Post.newBuilder();
            List<Comment> allComments = new ArrayList<>();
            List<Share> allShares = new ArrayList<>();

            post.getComments().forEach(element ->
                    allComments.add(commentRepository.getFirstByCommentId(element)));
            post.getShares().forEach(element ->
                    allShares.add(convertToRpcShare(sharesRepository.getFirstByShareId(element))));

            rpcPost.addAllComments(convertToRpcCommentList(allComments));
            rpcPost.setContent(post.getContent());
            rpcPost.setUserId(post.getUserId());
            rpcPost.setId(post.getId());
            rpcPost.addAllLikes(post.getLikes());
            rpcPost.addAllShares(allShares);
            rpcPost.setImages(post.getImages());

            return rpcPost.build();
        }
        return null;
    }

    public Share convertToRpcShare(web.service.newsfeed.model.Share share) {
        Share.Builder rpcShare = Share.newBuilder();
        rpcShare.setContent(share.getContent());
        rpcShare.setUserId(share.getUserId());
        rpcShare.setId(share.getShareId());
        return rpcShare.build();
    }

    public GetNewsFeedResponse getNewsFeed(GetNewsFeedRequest request) {
        List<web.service.newsfeed.rpc.Post> posts = new ArrayList<>();
        List<String> friends = followClientRpc.getFriends(request.getUserId());

        friends.forEach(user -> posts.add(getNewPostUser(user)));

        GetNewsFeedResponse.Builder response = GetNewsFeedResponse.newBuilder();
        response.addAllPosts(posts);
        return response.build();
    }

    private List<web.service.newsfeed.rpc.Comment> convertToRpcCommentList(List<Comment> commentsJava) {
        List<web.service.newsfeed.rpc.Comment> allComment = new ArrayList<>();
        commentsJava.forEach(element -> addCommentToRpcListComment(element, allComment));
        return allComment;
    }

    private void addCommentToRpcListComment(Comment comment, List<web.service.newsfeed.rpc.Comment> rpcList) {
        web.service.newsfeed.rpc.Comment.Builder rpcComment = web.service.newsfeed.rpc.Comment.newBuilder();
        rpcComment.setContent(comment.getContent());
        rpcComment.setUserAvatar(comment.getUserAvatar());
        rpcComment.setContent(comment.getContent());
        List<ChildComment> listChildComment = new ArrayList<>();
        comment.getChildComments().forEach(element ->addChildComment(element, listChildComment));
        rpcComment.addAllChildComments(listChildComment);
        rpcList.add(rpcComment.build());
    }

    private void addChildComment(web.service.newsfeed.model.ChildComment childComment,
                                 List<web.service.newsfeed.rpc.ChildComment> listChildComment) {
        ChildComment.Builder rpcChildComment = ChildComment.newBuilder();
        rpcChildComment.setContent(childComment.getContent());
        rpcChildComment.setAvatar(userClientRpc.getUserAvatarFromUserService(childComment.getUserId()));
        listChildComment.add(rpcChildComment.build());
    }

    public SaveNewPostResponse saveNewPost(web.service.newsfeed.rpc.Post newPost) {
        Post post = new Post();
        post.setUserId(newPost.getUserId());
        post.setContent(newPost.getContent());
        post.setImages(newPost.getImages());
        post.setPostTime(LocalDateTime.now());
        postRepository.save(post);
        SaveNewPostResponse.Builder response = SaveNewPostResponse.newBuilder();
        if(userClientRpc.addNewImage(newPost.getUserId(), newPost.getImages())) {
            response.setStatus(Status.SUCCESS);
        }
        else response.setStatus(Status.CAN_NOT_SAVE);
        return response.build();
    }

    /**
     * get group socket
     * @param request
     * @return
     */
//    public GetNewsGroupResponse getNewsGroup(GetNewsFeedRequest request) {
//        String userId = request.getUserId();
//
//        List<String> followers = followClientRpc.getFollowing(request.getUserId());
//    }
    public GetUserPostListResponse getUserPostList(GetUserPostListRequest request) {
        String userId = request.getUserId();

        List<Post> postList = postRepository.findByUserIdOrderByPostTimeDesc(userId);
        GetUserPostListResponse.Builder response = GetUserPostListResponse.newBuilder();
        postList.stream().forEach(post -> {
            UserPotsInfo.Builder postInfo = UserPotsInfo.newBuilder();
            postInfo.setPostId(post.getId());
            postInfo.setImage(post.getImages());
            response.addPosts(postInfo.build());
        });

        return response.build();
    }
}
