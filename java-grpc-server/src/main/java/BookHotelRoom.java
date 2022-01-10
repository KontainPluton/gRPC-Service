import grpc.BookHotelRoomGrpc;
import grpc.Hotel;
import io.grpc.stub.StreamObserver;

public class BookHotelRoom extends BookHotelRoomGrpc.BookHotelRoomImplBase {

    @Override
    public void getRoom(Hotel.Dates request, StreamObserver<Hotel.RoomData> responseObserver) {
        super.getRoom(request, responseObserver);
    }

    @Override
    public void bookRoom(Hotel.Booking request, StreamObserver<Hotel.Book> responseObserver) {
        super.bookRoom(request, responseObserver);
    }
}
