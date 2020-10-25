package web.service.newsfeed.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Comment {
    @Id
    private String commentId;
    private String content;
    private String userId;
    private String userAvatar;
    private LocalDateTime commentTime;
    private ArrayList<ChildComment> childComments;
}
