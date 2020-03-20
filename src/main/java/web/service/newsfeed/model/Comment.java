package web.service.newsfeed.model;

import web.service.user.model.User;


public class Comment {
    private String content;
    private long userId;

    public Comment(web.service.grpc.newsfeed.Comment comment){
        this.content = comment.getContent();
        this.userId = comment.getUserId();
    }
}
