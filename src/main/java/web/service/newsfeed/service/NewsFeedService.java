package web.service.newsfeed.service;

import org.springframework.stereotype.Service;
import web.service.newsfeed.model.Post;
import web.service.newsfeed.repository.CommentsRepository;
import web.service.newsfeed.repository.PostsRepository;
import web.service.newsfeed.repository.SharesRepository;
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

    private Post getNewPostUser(String userId) {
        Post post = postRepository.getPostByUserId(userId);
    }

    public GetNewsFeedResponse getNewsFeed(GetNewsFeedRequest request) {
        List<Post> posts = new ArrayList<Post>();
        List<String> friends = followClientRpc.getFriends(request.getUserId());
        friends.forEach(user -> );
    }
}
