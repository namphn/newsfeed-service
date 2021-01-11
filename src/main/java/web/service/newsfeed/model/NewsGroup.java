package web.service.newsfeed.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class NewsGroup {
    @Id
    private String groupId;
    private List<String> userId;
}
