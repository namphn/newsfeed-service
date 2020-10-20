package web.service.newsfeed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Post {
    @Id
    private String id;
    private String content;
    private List<String> images;
    private List<Comment> comments;
    private List<String> likes;
    private List<Share> shares;

    /**
     * feature to update add tags
     */
//    private List<String> tags;

}
