package web.service.newsfeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.newsfeed.model.Post;

import java.util.List;

@Repository
public interface PostsRepository extends MongoRepository<Post, String> {
    List<Post> findAll();
    Post getPostByUserId(String userId);
}
