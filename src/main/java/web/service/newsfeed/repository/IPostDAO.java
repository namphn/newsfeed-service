package web.service.newsfeed.repository;

import web.service.newsfeed.model.Post;

import java.util.List;

public interface IPostDAO {
    public List<Post> getAllPostByUserId(String userId);
}
