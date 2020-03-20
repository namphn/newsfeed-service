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
}
