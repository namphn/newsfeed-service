package web.service.newsfeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.newsfeed.model.Post;

import java.util.List;

@Repository
public interface PostsRepostiory extends MongoRepository<Post, Long> {
    List<Post> findAll();

    <S extends Post> S save(S s);

    Post findAllById(String id);
}
