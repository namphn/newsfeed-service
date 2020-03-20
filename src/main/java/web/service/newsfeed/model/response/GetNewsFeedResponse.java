package web.service.newsfeed.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import web.service.newsfeed.model.Post;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetNewsFeedResponse {
    List<Post> posts;
}
