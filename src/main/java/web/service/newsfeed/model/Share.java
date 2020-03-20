package web.service.newsfeed.model;

import lombok.Data;

@Data
public class Share {
    private long userId;
    private String content;

    public Share(web.service.grpc.newsfeed.Share share){
        this.userId = share.getUserId();
        this.content = share.getContent();
    }

}
