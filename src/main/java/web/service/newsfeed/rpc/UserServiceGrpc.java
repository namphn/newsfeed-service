package web.service.newsfeed.rpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserAvatarRequest,
      web.service.newsfeed.rpc.GetUserAvatarResponse> getGetUserAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserAvatar",
      requestType = web.service.newsfeed.rpc.GetUserAvatarRequest.class,
      responseType = web.service.newsfeed.rpc.GetUserAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserAvatarRequest,
      web.service.newsfeed.rpc.GetUserAvatarResponse> getGetUserAvatarMethod() {
    io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserAvatarRequest, web.service.newsfeed.rpc.GetUserAvatarResponse> getGetUserAvatarMethod;
    if ((getGetUserAvatarMethod = UserServiceGrpc.getGetUserAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserAvatarMethod = UserServiceGrpc.getGetUserAvatarMethod) == null) {
          UserServiceGrpc.getGetUserAvatarMethod = getGetUserAvatarMethod = 
              io.grpc.MethodDescriptor.<web.service.newsfeed.rpc.GetUserAvatarRequest, web.service.newsfeed.rpc.GetUserAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getUserAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.GetUserAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.GetUserAvatarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserAvatar"))
                  .build();
          }
        }
     }
     return getGetUserAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.newsfeed.rpc.AddNewImageRequest,
      web.service.newsfeed.rpc.AddNewImageResponse> getAddNewImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNewImage",
      requestType = web.service.newsfeed.rpc.AddNewImageRequest.class,
      responseType = web.service.newsfeed.rpc.AddNewImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.newsfeed.rpc.AddNewImageRequest,
      web.service.newsfeed.rpc.AddNewImageResponse> getAddNewImageMethod() {
    io.grpc.MethodDescriptor<web.service.newsfeed.rpc.AddNewImageRequest, web.service.newsfeed.rpc.AddNewImageResponse> getAddNewImageMethod;
    if ((getAddNewImageMethod = UserServiceGrpc.getAddNewImageMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddNewImageMethod = UserServiceGrpc.getAddNewImageMethod) == null) {
          UserServiceGrpc.getAddNewImageMethod = getAddNewImageMethod = 
              io.grpc.MethodDescriptor.<web.service.newsfeed.rpc.AddNewImageRequest, web.service.newsfeed.rpc.AddNewImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "addNewImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.AddNewImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.AddNewImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addNewImage"))
                  .build();
          }
        }
     }
     return getAddNewImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserNameRequest,
      web.service.newsfeed.rpc.GetUserNameResponse> getGetUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserName",
      requestType = web.service.newsfeed.rpc.GetUserNameRequest.class,
      responseType = web.service.newsfeed.rpc.GetUserNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserNameRequest,
      web.service.newsfeed.rpc.GetUserNameResponse> getGetUserNameMethod() {
    io.grpc.MethodDescriptor<web.service.newsfeed.rpc.GetUserNameRequest, web.service.newsfeed.rpc.GetUserNameResponse> getGetUserNameMethod;
    if ((getGetUserNameMethod = UserServiceGrpc.getGetUserNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserNameMethod = UserServiceGrpc.getGetUserNameMethod) == null) {
          UserServiceGrpc.getGetUserNameMethod = getGetUserNameMethod = 
              io.grpc.MethodDescriptor.<web.service.newsfeed.rpc.GetUserNameRequest, web.service.newsfeed.rpc.GetUserNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.GetUserNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.newsfeed.rpc.GetUserNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserName"))
                  .build();
          }
        }
     }
     return getGetUserNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public void getUserAvatar(web.service.newsfeed.rpc.GetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserAvatarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserAvatarMethod(), responseObserver);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public void addNewImage(web.service.newsfeed.rpc.AddNewImageRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.AddNewImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNewImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public void getUserName(web.service.newsfeed.rpc.GetUserNameRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.newsfeed.rpc.GetUserAvatarRequest,
                web.service.newsfeed.rpc.GetUserAvatarResponse>(
                  this, METHODID_GET_USER_AVATAR)))
          .addMethod(
            getAddNewImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.newsfeed.rpc.AddNewImageRequest,
                web.service.newsfeed.rpc.AddNewImageResponse>(
                  this, METHODID_ADD_NEW_IMAGE)))
          .addMethod(
            getGetUserNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.newsfeed.rpc.GetUserNameRequest,
                web.service.newsfeed.rpc.GetUserNameResponse>(
                  this, METHODID_GET_USER_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public void getUserAvatar(web.service.newsfeed.rpc.GetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserAvatarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public void addNewImage(web.service.newsfeed.rpc.AddNewImageRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.AddNewImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNewImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public void getUserName(web.service.newsfeed.rpc.GetUserNameRequest request,
        io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public web.service.newsfeed.rpc.GetUserAvatarResponse getUserAvatar(web.service.newsfeed.rpc.GetUserAvatarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserAvatarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public web.service.newsfeed.rpc.AddNewImageResponse addNewImage(web.service.newsfeed.rpc.AddNewImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddNewImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public web.service.newsfeed.rpc.GetUserNameResponse getUserName(web.service.newsfeed.rpc.GetUserNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.newsfeed.rpc.GetUserAvatarResponse> getUserAvatar(
        web.service.newsfeed.rpc.GetUserAvatarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserAvatarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.newsfeed.rpc.AddNewImageResponse> addNewImage(
        web.service.newsfeed.rpc.AddNewImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNewImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.newsfeed.rpc.GetUserNameResponse> getUserName(
        web.service.newsfeed.rpc.GetUserNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_AVATAR = 0;
  private static final int METHODID_ADD_NEW_IMAGE = 1;
  private static final int METHODID_GET_USER_NAME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_AVATAR:
          serviceImpl.getUserAvatar((web.service.newsfeed.rpc.GetUserAvatarRequest) request,
              (io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserAvatarResponse>) responseObserver);
          break;
        case METHODID_ADD_NEW_IMAGE:
          serviceImpl.addNewImage((web.service.newsfeed.rpc.AddNewImageRequest) request,
              (io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.AddNewImageResponse>) responseObserver);
          break;
        case METHODID_GET_USER_NAME:
          serviceImpl.getUserName((web.service.newsfeed.rpc.GetUserNameRequest) request,
              (io.grpc.stub.StreamObserver<web.service.newsfeed.rpc.GetUserNameResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.service.newsfeed.rpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserAvatarMethod())
              .addMethod(getAddNewImageMethod())
              .addMethod(getGetUserNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
