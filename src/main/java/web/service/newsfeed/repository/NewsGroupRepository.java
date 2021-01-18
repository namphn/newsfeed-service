package web.service.newsfeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import web.service.newsfeed.model.NewsGroup;

public interface NewsGroupRepository extends MongoRepository<NewsGroup, String>, NewsGroupDAO {
}
