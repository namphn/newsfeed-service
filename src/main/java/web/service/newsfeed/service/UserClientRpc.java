package web.service.newsfeed.service;

import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.service.newsfeed.rpc.GetUserAvatarRequest;
import web.service.newsfeed.rpc.GetUserAvatarResponse;
import web.service.newsfeed.rpc.UserServiceGrpc;

@Service
public class UserClientRpc {
    @Autowired
    @Qualifier("user-service")
    private ManagedChannel channel;

    public String getUserAvatarFromUserService(String userId) {
        GetUserAvatarRequest.Builder request = GetUserAvatarRequest.newBuilder();
        request.setUserId(userId);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        GetUserAvatarResponse response = null;
        try {
            response = stub.getUserAvatar(request.build());
        } catch (Exception e) {
            return null;
        }
        return response.getAvatar();
    }
}
