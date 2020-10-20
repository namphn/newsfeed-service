package web.service.newsfeed.rpc;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import web.service.grpc.newsfeed.*;
import web.service.newsfeed.service.NewsFeedService;

@GRpcService
public class NewsFeedServiceGrpcImpl extends NewsFeedServiceGrpc.NewsFeedServiceImplBase {

    private final NewsFeedService newsFeedService;

    public NewsFeedServiceGrpcImpl(NewsFeedService newsFeedService) {
        this.newsFeedService = newsFeedService;
    }

    @Override
    public void getNewsFeed(GetNewsFeedRequest request, StreamObserver<GetNewsFeedResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.getNewsFees(request));
        responseObserver.onCompleted();
    }

    @Override
    public void saveNewPost(Post post, StreamObserver<SaveNewPostResponse> responseObserver) {
        web.service.newsfeed.model.Post post1 = new web.service.newsfeed.model.Post(post);
        responseObserver.onNext(newsFeedService.saveNewPost(post1));
        responseObserver.onCompleted();
    }

    @Override
    public void like(LikeRequest request, StreamObserver<LikeResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.like(request));
        responseObserver.onCompleted();
    }

    @Override
    public void share(ShareRequest request, StreamObserver<ShareResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.share(request));
        responseObserver.onCompleted();
    }

    @Override
    public void comment(CommentRequest request, StreamObserver<CommentResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.comment(request));
        responseObserver.onCompleted();
    }

    @Override
    public void tag(TagRequest request, StreamObserver<TagResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.tag(request));
        responseObserver.onCompleted();
    }
}
