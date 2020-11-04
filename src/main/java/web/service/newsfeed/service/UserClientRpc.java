package web.service.newsfeed.service;

import io.grpc.ManagedChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.service.newsfeed.rpc.*;

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

    public boolean addNewImage(String userId, String image) {
        AddNewImageRequest.Builder request = AddNewImageRequest.newBuilder();
        request.setUserId(userId);
        request.setImage(image);
        UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
        AddNewImageResponse response = null;
        try {
            response = stub.addNewImage(request.build());
        } catch (Exception e) {
            return false;
        }
        return (response != null && response.getSuccess());
    }
}
