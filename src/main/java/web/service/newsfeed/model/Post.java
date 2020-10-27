package web.service.newsfeed.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Post {
    @Id
    private String id;
    private String userId;
    private String content;
    private String images;
    private List<String> comments;
    private List<String> likes;
    private List<String> shares;
    private LocalDateTime postTime;

    /**
     * feature to update add tags
     */
//    private List<String> tags;

}
