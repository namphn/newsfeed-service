package web.service.newsfeed.service;

import javafx.geometry.Pos;
import org.springframework.stereotype.Service;
import web.service.newsfeed.model.Comment;
import web.service.newsfeed.model.Post;
import web.service.newsfeed.repository.CommentsRepository;
import web.service.newsfeed.repository.PostsRepository;
import web.service.newsfeed.repository.SharesRepository;
import web.service.newsfeed.rpc.ChildComment;
import web.service.newsfeed.rpc.GetNewsFeedRequest;
import web.service.newsfeed.rpc.GetNewsFeedResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsFeedService {

    private final PostsRepository postRepository;
    private final CommentsRepository commentRepository;
    private final SharesRepository sharesRepository;
    private final FollowClientRpc followClientRpc;

    public NewsFeedService(PostsRepository postRepository, CommentsRepository commentRepository, SharesRepository sharesRepository, FollowClientRpc followClientRpc) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.sharesRepository = sharesRepository;
        this.followClientRpc = followClientRpc;
    }

    private void getNewPostUser(String userId, List<web.service.newsfeed.rpc.Post> allPosts) {
        Post post = postRepository.findDistinctFirstByUserIdAndOrderByPostTimeDesc(userId);
        if(post != null) {
            web.service.newsfeed.rpc.Post.Builder rpcPost = web.service.newsfeed.rpc.Post.newBuilder();
            rpcPost.addAllComments()
        }
    }

    public GetNewsFeedResponse getNewsFeed(GetNewsFeedRequest request) {
        List<web.service.newsfeed.rpc.Post> posts = new ArrayList<>();
        List<String> friends = followClientRpc.getFriends(request.getUserId());
        friends.forEach(user -> getNewPostUser(user, posts));

        GetNewsFeedResponse.Builder response = GetNewsFeedResponse.newBuilder();
        response.addAllPosts(posts)
    }

    private List<web.service.newsfeed.rpc.Comment> convertToRpcCommentList(List<Comment> commentsJava) {
        web.service.newsfeed.rpc.Comment.Builder comment = web.service.newsfeed.rpc.Comment.newBuilder();
        List<ChildComment> allChildComment = new ArrayList<>();
        List<web.service.newsfeed.rpc.Comment> allComment = new ArrayList<>();
        commentsJava.forEach(element -> addCommentToRpcListComment(element, allComment));
    }

    private void addCommentToRpcListComment(Comment comment, List<web.service.newsfeed.rpc.Comment> rpcList) {
        web.service.newsfeed.rpc.Comment.Builder rpcComment = web.service.newsfeed.rpc.Comment.newBuilder();
        rpcComment.setContent(comment.getContent());
        rpcComment.setUserAvatar(comment.getUserAvatar());
        rpcComment.setC
    }
}
