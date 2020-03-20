package web.service.newsfeed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private long id;
    private String content;
    private List<Comment> comment;
    private List<Long> likes;
    private List<Share> shares;
    private List<Long> tags;

    public void addNewLike(long userId){
        this.likes.add(userId);
    }

    public Post(web.service.grpc.newsfeed.Post post){
        this.id = post.getId();
        this.content = post.getContent();
        List<Comment> comments = new ArrayList<>();
        for(int i=0; i<post.getCommentsList().size(); i++){
            Comment comment = new Comment(post.getComments(i));
            comments.add(comment);
        }
        this.comment = comments;
        this.likes = new ArrayList<>();

        for(int i=0; i<post.getLikesList().size(); i++){
            this.likes.add(post.getLikesList().get(i).getUserId());
        }
        this.shares = new ArrayList<>();
        for(int i=0; i<post.getSharesList().size(); i++){
            Share share = new Share(post.getSharesList().get(i));
            this.shares.add(share);
        }

        this.tags = new ArrayList<>();
        for(int i=0; i<post.getTagsList().size(); i++){
            tags.add(post.getTagsList().get(i).getUserId());
        }
    }
}
