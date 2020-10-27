package web.service.newsfeed.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import web.service.newsfeed.model.Share;

@Repository
public interface SharesRepository extends MongoRepository<Share, String> {
    Share getFirstByShareId(String id);
}
