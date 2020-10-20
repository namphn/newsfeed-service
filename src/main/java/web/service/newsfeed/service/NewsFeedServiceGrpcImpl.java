package web.service.newsfeed.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import web.service.newsfeed.rpc.*;

@GRpcService
public class NewsFeedServiceGrpcImpl extends NewsFeedServiceGrpc.NewsFeedServiceImplBase {
    @Override
    public void getNewsFeed(GetNewsFeedRequest request, StreamObserver<GetNewsFeedResponse> responseObserver) {
        super.getNewsFeed(request, responseObserver);
    }

    @Override
    public void saveNewPost(Post request, StreamObserver<SaveNewPostResponse> responseObserver) {
        super.saveNewPost(request, responseObserver);
    }

    @Override
    public void like(LikeRequest request, StreamObserver<LikeResponse> responseObserver) {
        super.like(request, responseObserver);
    }

    @Override
    public void share(ShareRequest request, StreamObserver<ShareResponse> responseObserver) {
        super.share(request, responseObserver);
    }

    @Override
    public void comment(CommentRequest request, StreamObserver<CommentResponse> responseObserver) {
        super.comment(request, responseObserver);
    }

    @Override
    public void tag(TagRequest request, StreamObserver<TagResponse> responseObserver) {
        super.tag(request, responseObserver);
    }
}
