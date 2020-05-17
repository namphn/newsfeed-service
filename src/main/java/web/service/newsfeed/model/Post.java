package web.service.newsfeed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import web.service.grpc.newsfeed.CommentRequest;
import web.service.grpc.newsfeed.TagRequest;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    private String id;
    private String content;
    private List<String> images;
    private List<Comment> comments;
    private List<String> likes;
    private List<Share> shares;
    private List<String> tags;

    public Post(web.service.grpc.newsfeed.Post post){
        this.id = post.getId();
        this.content = post.getContent();
        List<Comment> comments = new ArrayList<Comment>();
        for(int i=0; i<post.getCommentsList().size(); i++){
            Comment comment = new Comment(post.getComments(i));
            comments.add(comment);
        }
        this.comments = comments;
        this.likes = post.getLikesList();
        this.shares = new ArrayList<Share>();
        for(int i=0; i<post.getSharesList().size(); i++){
            Share share = new Share(post.getSharesList().get(i));
            this.shares.add(share);
        }
        this.tags = post.getTagsList();
        this.images = post.getImagesList();
    }

    public void addNewLike(String userId){
        this.likes.add(userId);
    }

    public void addNewShare(String userId, String content) {
        Share share = new Share(userId, content);
        this.shares.add(share);
    }

    public void addNewComment(CommentRequest request){
        Comment comment = new Comment(request.getContent(), request.getUserId());
        this.comments.add(comment);
    }

    public void addNewTag(TagRequest request){
        this.tags.add(request.getUserId());
    }
}
