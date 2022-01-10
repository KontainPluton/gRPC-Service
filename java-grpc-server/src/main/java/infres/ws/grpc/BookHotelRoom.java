package infres.ws.grpc;

import grpc.BookHotelRoomGrpc;
import grpc.BookHotelRoomOuterClass;
import io.grpc.stub.StreamObserver;

public class BookHotelRoom extends BookHotelRoomGrpc.BookHotelRoomImplBase {

    @Override
    public void getRoom(BookHotelRoomOuterClass.RoomNumber request, StreamObserver<BookHotelRoomOuterClass.RoomData> responseObserver) {
        BookHotelRoomOuterClass.RoomData roomData = BookHotelRoomOuterClass.RoomData.newBuilder()
                .setType(BookHotelRoomOuterClass.RoomType.BASIQUE)
                .setPrice(50.1032f)
                .build();

        responseObserver.onNext(roomData);
        responseObserver.onCompleted();
    }

    @Override
    public void bookRoom(BookHotelRoomOuterClass.Booking request, StreamObserver<BookHotelRoomOuterClass.Book> responseObserver) {
        BookHotelRoomOuterClass.Book book = BookHotelRoomOuterClass.Book.newBuilder()
                .setBookStatus(false)
                .build();

        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }
}
