package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *The BookRoom service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: Hotel.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookHotelRoomGrpc {

  private BookHotelRoomGrpc() {}

  public static final String SERVICE_NAME = "BookHotelRoom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Hotel.Dates,
      Hotel.RoomData> getGetRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRoom",
      requestType = Hotel.Dates.class,
      responseType = Hotel.RoomData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Hotel.Dates,
      Hotel.RoomData> getGetRoomMethod() {
    io.grpc.MethodDescriptor<Hotel.Dates, Hotel.RoomData> getGetRoomMethod;
    if ((getGetRoomMethod = BookHotelRoomGrpc.getGetRoomMethod) == null) {
      synchronized (BookHotelRoomGrpc.class) {
        if ((getGetRoomMethod = BookHotelRoomGrpc.getGetRoomMethod) == null) {
          BookHotelRoomGrpc.getGetRoomMethod = getGetRoomMethod =
              io.grpc.MethodDescriptor.<Hotel.Dates, Hotel.RoomData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hotel.Dates.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hotel.RoomData.getDefaultInstance()))
              .setSchemaDescriptor(new BookHotelRoomMethodDescriptorSupplier("GetRoom"))
              .build();
        }
      }
    }
    return getGetRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Hotel.Booking,
      Hotel.Book> getBookRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookRoom",
      requestType = Hotel.Booking.class,
      responseType = Hotel.Book.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Hotel.Booking,
      Hotel.Book> getBookRoomMethod() {
    io.grpc.MethodDescriptor<Hotel.Booking, Hotel.Book> getBookRoomMethod;
    if ((getBookRoomMethod = BookHotelRoomGrpc.getBookRoomMethod) == null) {
      synchronized (BookHotelRoomGrpc.class) {
        if ((getBookRoomMethod = BookHotelRoomGrpc.getBookRoomMethod) == null) {
          BookHotelRoomGrpc.getBookRoomMethod = getBookRoomMethod =
              io.grpc.MethodDescriptor.<Hotel.Booking, Hotel.Book>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hotel.Booking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Hotel.Book.getDefaultInstance()))
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
   * <pre>
   *The BookRoom service definition.
   * </pre>
   */
  public static abstract class BookHotelRoomImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRoom(Hotel.Dates request,
                        io.grpc.stub.StreamObserver<Hotel.RoomData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRoomMethod(), responseObserver);
    }

    /**
     */
    public void bookRoom(Hotel.Booking request,
                         io.grpc.stub.StreamObserver<Hotel.Book> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookRoomMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Hotel.Dates,
                Hotel.RoomData>(
                  this, METHODID_GET_ROOM)))
          .addMethod(
            getBookRoomMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Hotel.Booking,
                Hotel.Book>(
                  this, METHODID_BOOK_ROOM)))
          .build();
    }
  }

  /**
   * <pre>
   *The BookRoom service definition.
   * </pre>
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
    public void getRoom(Hotel.Dates request,
                        io.grpc.stub.StreamObserver<Hotel.RoomData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookRoom(Hotel.Booking request,
                         io.grpc.stub.StreamObserver<Hotel.Book> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *The BookRoom service definition.
   * </pre>
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
    public Hotel.RoomData getRoom(Hotel.Dates request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRoomMethod(), getCallOptions(), request);
    }

    /**
     */
    public Hotel.Book bookRoom(Hotel.Booking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *The BookRoom service definition.
   * </pre>
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
    public com.google.common.util.concurrent.ListenableFuture<Hotel.RoomData> getRoom(
        Hotel.Dates request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRoomMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Hotel.Book> bookRoom(
        Hotel.Booking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ROOM = 0;
  private static final int METHODID_BOOK_ROOM = 1;

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
        case METHODID_GET_ROOM:
          serviceImpl.getRoom((Hotel.Dates) request,
              (io.grpc.stub.StreamObserver<Hotel.RoomData>) responseObserver);
          break;
        case METHODID_BOOK_ROOM:
          serviceImpl.bookRoom((Hotel.Booking) request,
              (io.grpc.stub.StreamObserver<Hotel.Book>) responseObserver);
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
      return Hotel.getDescriptor();
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
              .addMethod(getGetRoomMethod())
              .addMethod(getBookRoomMethod())
              .build();
        }
      }
    }
    return result;
  }
}
