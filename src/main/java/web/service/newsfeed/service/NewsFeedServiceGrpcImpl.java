package web.service.newsfeed.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import web.service.newsfeed.rpc.*;

@GRpcService
public class NewsFeedServiceGrpcImpl extends NewsFeedServiceGrpc.NewsFeedServiceImplBase {

    @Autowired
    NewsFeedService newsFeedService;

    @Override
    public void getNewsFeed(GetNewsFeedRequest request, StreamObserver<GetNewsFeedResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.getNewsFeed(request));
        responseObserver.onCompleted();
    }

    @Override
    public void saveNewPost(Post request, StreamObserver<SaveNewPostResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.saveNewPost(request));
        responseObserver.onCompleted();
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

    @Override
    public void getNewsGroup(GetNewsGroupRequest request, StreamObserver<GetNewsGroupResponse> responseObserver) {
        super.getNewsGroup(request, responseObserver);
    }

    @Override
    public void getFollower(GetUserPostListRequest request, StreamObserver<GetUserPostListResponse> responseObserver) {
        responseObserver.onNext(newsFeedService.getUserPostList(request));
        responseObserver.onCompleted();
    }
}
