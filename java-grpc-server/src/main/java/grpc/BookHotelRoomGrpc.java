package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: BookHotelRoom.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookHotelRoomGrpc {

  private BookHotelRoomGrpc() {}

  public static final String SERVICE_NAME = "BookHotelRoom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Empty,
      BookHotelRoomOuterClass.RoomNumbers> getGetAllRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRoom",
      requestType = BookHotelRoomOuterClass.Empty.class,
      responseType = BookHotelRoomOuterClass.RoomNumbers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Empty,
      BookHotelRoomOuterClass.RoomNumbers> getGetAllRoomMethod() {
    io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Empty, BookHotelRoomOuterClass.RoomNumbers> getGetAllRoomMethod;
    if ((getGetAllRoomMethod = BookHotelRoomGrpc.getGetAllRoomMethod) == null) {
      synchronized (BookHotelRoomGrpc.class) {
        if ((getGetAllRoomMethod = BookHotelRoomGrpc.getGetAllRoomMethod) == null) {
          BookHotelRoomGrpc.getGetAllRoomMethod = getGetAllRoomMethod =
              io.grpc.MethodDescriptor.<BookHotelRoomOuterClass.Empty, BookHotelRoomOuterClass.RoomNumbers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.RoomNumbers.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomMethodDescriptorSupplier("GetAllRoom"))
              .build();
        }
      }
    }
    return getGetAllRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BookHotelRoomOuterClass.RoomNumber,
      BookHotelRoomOuterClass.RoomData> getGetRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoom",
      requestType = BookHotelRoomOuterClass.RoomNumber.class,
      responseType = BookHotelRoomOuterClass.RoomData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BookHotelRoomOuterClass.RoomNumber,
      BookHotelRoomOuterClass.RoomData> getGetRoomMethod() {
    io.grpc.MethodDescriptor<BookHotelRoomOuterClass.RoomNumber, BookHotelRoomOuterClass.RoomData> getGetRoomMethod;
    if ((getGetRoomMethod = BookHotelRoomGrpc.getGetRoomMethod) == null) {
      synchronized (BookHotelRoomGrpc.class) {
        if ((getGetRoomMethod = BookHotelRoomGrpc.getGetRoomMethod) == null) {
          BookHotelRoomGrpc.getGetRoomMethod = getGetRoomMethod =
              io.grpc.MethodDescriptor.<BookHotelRoomOuterClass.RoomNumber, BookHotelRoomOuterClass.RoomData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.RoomNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.RoomData.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomMethodDescriptorSupplier("GetRoom"))
              .build();
        }
      }
    }
    return getGetRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Booking,
      BookHotelRoomOuterClass.Book> getBookRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookRoom",
      requestType = BookHotelRoomOuterClass.Booking.class,
      responseType = BookHotelRoomOuterClass.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Booking,
      BookHotelRoomOuterClass.Book> getBookRoomMethod() {
    io.grpc.MethodDescriptor<BookHotelRoomOuterClass.Booking, BookHotelRoomOuterClass.Book> getBookRoomMethod;
    if ((getBookRoomMethod = BookHotelRoomGrpc.getBookRoomMethod) == null) {
      synchronized (BookHotelRoomGrpc.class) {
        if ((getBookRoomMethod = BookHotelRoomGrpc.getBookRoomMethod) == null) {
          BookHotelRoomGrpc.getBookRoomMethod = getBookRoomMethod =
              io.grpc.MethodDescriptor.<BookHotelRoomOuterClass.Booking, BookHotelRoomOuterClass.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.Booking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BookHotelRoomOuterClass.Book.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomMethodDescriptorSupplier("BookRoom"))
              .build();
        }
      }
    }
    return getBookRoomMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookHotelRoomStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomStub>() {
        @Override
        public BookHotelRoomStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomStub(channel, callOptions);
        }
      };
    return BookHotelRoomStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookHotelRoomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomBlockingStub>() {
        @Override
        public BookHotelRoomBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomBlockingStub(channel, callOptions);
        }
      };
    return BookHotelRoomBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookHotelRoomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookHotelRoomFutureStub>() {
        @Override
        public BookHotelRoomFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookHotelRoomFutureStub(channel, callOptions);
        }
      };
    return BookHotelRoomFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BookHotelRoomImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllRoom(BookHotelRoomOuterClass.Empty request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomNumbers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRoomMethod(), responseObserver);
    }

    /**
     */
    public void getRoom(BookHotelRoomOuterClass.RoomNumber request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomMethod(), responseObserver);
    }

    /**
     */
    public void bookRoom(BookHotelRoomOuterClass.Booking request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookRoomMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BookHotelRoomOuterClass.Empty,
                BookHotelRoomOuterClass.RoomNumbers>(
                  this, METHODID_GET_ALL_ROOM)))
          .addMethod(
            getGetRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BookHotelRoomOuterClass.RoomNumber,
                BookHotelRoomOuterClass.RoomData>(
                  this, METHODID_GET_ROOM)))
          .addMethod(
            getBookRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BookHotelRoomOuterClass.Booking,
                BookHotelRoomOuterClass.Book>(
                  this, METHODID_BOOK_ROOM)))
          .build();
    }
  }

  /**
   */
  public static final class BookHotelRoomStub extends io.grpc.stub.AbstractAsyncStub<BookHotelRoomStub> {
    private BookHotelRoomStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BookHotelRoomStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomStub(channel, callOptions);
    }

    /**
     */
    public void getAllRoom(BookHotelRoomOuterClass.Empty request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomNumbers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRoom(BookHotelRoomOuterClass.RoomNumber request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookRoom(BookHotelRoomOuterClass.Booking request,
        io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookHotelRoomBlockingStub extends io.grpc.stub.AbstractBlockingStub<BookHotelRoomBlockingStub> {
    private BookHotelRoomBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BookHotelRoomBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomBlockingStub(channel, callOptions);
    }

    /**
     */
    public BookHotelRoomOuterClass.RoomNumbers getAllRoom(BookHotelRoomOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public BookHotelRoomOuterClass.RoomData getRoom(BookHotelRoomOuterClass.RoomNumber request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public BookHotelRoomOuterClass.Book bookRoom(BookHotelRoomOuterClass.Booking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookHotelRoomFutureStub extends io.grpc.stub.AbstractFutureStub<BookHotelRoomFutureStub> {
    private BookHotelRoomFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected BookHotelRoomFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookHotelRoomFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BookHotelRoomOuterClass.RoomNumbers> getAllRoom(
        BookHotelRoomOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BookHotelRoomOuterClass.RoomData> getRoom(
        BookHotelRoomOuterClass.RoomNumber request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BookHotelRoomOuterClass.Book> bookRoom(
        BookHotelRoomOuterClass.Booking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_ROOM = 0;
  private static final int METHODID_GET_ROOM = 1;
  private static final int METHODID_BOOK_ROOM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookHotelRoomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookHotelRoomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_ROOM:
          serviceImpl.getAllRoom((BookHotelRoomOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomNumbers>) responseObserver);
          break;
        case METHODID_GET_ROOM:
          serviceImpl.getRoom((BookHotelRoomOuterClass.RoomNumber) request,
              (io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.RoomData>) responseObserver);
          break;
        case METHODID_BOOK_ROOM:
          serviceImpl.bookRoom((BookHotelRoomOuterClass.Booking) request,
              (io.grpc.stub.StreamObserver<BookHotelRoomOuterClass.Book>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BookHotelRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookHotelRoomBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BookHotelRoomOuterClass.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookHotelRoom");
    }
  }

  private static final class BookHotelRoomFileDescriptorSupplier
      extends BookHotelRoomBaseDescriptorSupplier {
    BookHotelRoomFileDescriptorSupplier() {}
  }

  private static final class BookHotelRoomMethodDescriptorSupplier
      extends BookHotelRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookHotelRoomMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BookHotelRoomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookHotelRoomFileDescriptorSupplier())
              .addMethod(getGetAllRoomMethod())
              .addMethod(getGetRoomMethod())
              .addMethod(getBookRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
