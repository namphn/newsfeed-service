package web.service.newsfeed.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Comment {
    private String content;
    private String userId;

    public Comment(web.service.grpc.newsfeed.Comment comment){
        this.content = comment.getContent();
        this.userId = comment.getUserId();
    }
}
