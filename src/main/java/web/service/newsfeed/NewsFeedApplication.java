package web.service.newsfeed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("web.service.newsfeed.repository")
public class NewsFeedApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsFeedApplication.class);
    }
}
