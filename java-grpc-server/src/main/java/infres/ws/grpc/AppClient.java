package infres.ws.grpc;

import grpc.BookHotelRoomGrpc;
import grpc.BookHotelRoomOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AppClient {
    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        BookHotelRoomGrpc.BookHotelRoomBlockingStub bookHotelRoomService = BookHotelRoomGrpc.newBlockingStub(channel);

        BookHotelRoomOuterClass.RoomNumber roomNumber = BookHotelRoomOuterClass.RoomNumber.newBuilder()
                .setNumero(1)
                .build();

        BookHotelRoomOuterClass.RoomData roomData = bookHotelRoomService.getRoom(roomNumber);
        System.out.println("{\ntype : " + roomData.getType() + ",\nprice : " + roomData.getPrice() + "\n}");
        channel.shutdown();

    }
}
