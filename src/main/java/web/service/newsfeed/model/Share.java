package web.service.newsfeed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Share {
    private String userId;
    private String content;

    public Share(web.service.grpc.newsfeed.Share share){
        this.userId = share.getUserId();
        this.content = share.getContent();
    }

}
