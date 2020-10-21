package web.service.newsfeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.newsfeed.model.Comment;

@Repository
public interface CommentsRepository extends MongoRepository<Comment, String> {
}
