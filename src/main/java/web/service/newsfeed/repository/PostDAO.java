package web.service.newsfeed.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import web.service.newsfeed.model.Post;
import java.util.List;

public class PostDAO implements IPostDAO {
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Post> getAllPostByUserId(String userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        List<Post> posts = mongoTemplate.find(query, Post.class);
        return posts;
    }
}
