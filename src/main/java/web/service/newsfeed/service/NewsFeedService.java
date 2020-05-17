package web.service.newsfeed.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.service.grpc.newsfeed.*;
import web.service.newsfeed.model.Post;
import web.service.newsfeed.model.Status;
import web.service.newsfeed.repository.PostsRepostiory;

import java.util.List;

@Service
@Transactional
public class NewsFeedService {

    private final PostsRepostiory repository;

    public NewsFeedService(PostsRepostiory repository) {
        this.repository = repository;
    }

    public GetNewsFeedResponse getNewsFees(GetNewsFeedRequest request){

        List<web.service.newsfeed.model.Post> posts =  repository.findAll();

        web.service.newsfeed.model.response.GetNewsFeedResponse getNewsFeedResponse
                = new web.service.newsfeed.model.response.GetNewsFeedResponse(posts);

        GetNewsFeedResponse.Builder response = GetNewsFeedResponse.newBuilder();
        ObjectMapper mapper = new ObjectMapper();
        try {
            String json = mapper.writeValueAsString(getNewsFeedResponse);

            JsonFormat.parser().ignoringUnknownFields().merge(json, response);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        return response.build();
    }

    public SaveNewPostResponse saveNewPost(web.service.newsfeed.model.Post post){
        Post newPost = repository.save(post);
        SaveNewPostResponse.Builder response = SaveNewPostResponse.newBuilder();
        if(newPost != null) {
            response.setStatus(Status.SAVED);
        } else {
            response.setStatus(Status.CAN_NOT_SAVE);
        }
        return response.build();
    }

    public LikeResponse like(LikeRequest request){
        Post post = repository.findAllById(request.getPostId());
        post.addNewLike(request.getUserId());
        repository.save(post);
        LikeResponse.Builder response = LikeResponse.newBuilder();
        response.setStatus(Status.LIKED);
        return response.build();
    }
    public ShareResponse share(ShareRequest request){
        Post post = repository.findAllById(request.getPostId());
        post.addNewShare(request.getUserId(), request.getContent());
        repository.save(post);
        ShareResponse.Builder response = ShareResponse.newBuilder();
        response.setStatus(Status.SHARED);
        return response.build();
    }

    public CommentResponse comment(CommentRequest request){
        Post post = repository.findAllById(request.getPostId());
        post.addNewComment(request);
        repository.save(post);
        CommentResponse.Builder response = CommentResponse.newBuilder();
        response.setStatus(Status.COMMENTED);
        return response.build();
    }

    public TagResponse tag(TagRequest request){
        Post post = repository.findAllById(request.getPostId());
        post.addNewTag(request);
        repository.save(post);
        TagResponse.Builder response = TagResponse.newBuilder();
        response.setStatus(Status.ADDED);
        return response.build();
    }

    public List<Post> getAllNewsFeed() {
        return this.repository.findAll();
    }
}
