package web.service.newsfeed.service;

import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.service.newsfeed.rpc.FollowRpcServiceGrpc;
import web.service.newsfeed.rpc.GetFollowerAndFollowingRequest;
import web.service.newsfeed.rpc.GetFollowingResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class FollowClientRpc {
    @Autowired
    @Qualifier("follow-service")
    private ManagedChannel channel;

    public List<String> getFriends(String userId) {
        List<String> friends = new ArrayList<>();
        GetFollowerAndFollowingRequest .Builder request = GetFollowerAndFollowingRequest.newBuilder();
        request.setUserId(userId);
        GetFollowingResponse response = null;
        FollowRpcServiceGrpc.FollowRpcServiceBlockingStub stub = FollowRpcServiceGrpc.newBlockingStub(channel);
        try {
            response = stub.getFollowing(request.build());
        } catch (Exception e) {
            System.out.println(e);
        }

        if(response != null) {
            friends.addAll(response.getFollowingList());
        }

        return friends;
    }

    public List<String> getFollowing(String userId) {
        if(userId == null || userId.isEmpty()) throw new NullPointerException();
        List<String> followers = new ArrayList<>();
        GetFollowingResponse response = null;
        FollowRpcServiceGrpc.FollowRpcServiceBlockingStub stub = FollowRpcServiceGrpc.newBlockingStub(channel);
        GetFollowerAndFollowingRequest .Builder request = GetFollowerAndFollowingRequest.newBuilder();
        request.setUserId(userId);

        try {
            response = stub.getFollowing(request.build());
            followers.addAll(response.getFollowingList());
        } catch (Exception e) {
            System.out.println(e);
        }

        return followers;
    }
}
