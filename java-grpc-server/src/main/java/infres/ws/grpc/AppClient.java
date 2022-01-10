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

        BookHotelRoomOuterClass.Dates dateDebut = BookHotelRoomOuterClass.Dates.newBuilder()
                .setDay(8)
                .setMonth(11)
                .setYear(1998)
                .build();

        BookHotelRoomOuterClass.Dates dateFin = BookHotelRoomOuterClass.Dates.newBuilder()
                .setDay(15)
                .setMonth(11)
                .setYear(1998)
                .build();

        BookHotelRoomOuterClass.Booking booking = BookHotelRoomOuterClass.Booking.newBuilder()
                .setNumero(1)
                .setDateDebut(dateDebut)
                .setDateFin(dateFin)
                .build();

        BookHotelRoomOuterClass.Book book = bookHotelRoomService.bookRoom(booking);

        System.out.println("Room n°1 : " + (book.getBookStatus() ? "réussite réservation" : "échec réservation"));

        BookHotelRoomOuterClass.Book book1 = bookHotelRoomService.bookRoom(booking);

        System.out.println("Room n°1 : " + (book1.getBookStatus() ? "réussite réservation" : "échec réservation"));


        BookHotelRoomOuterClass.Dates dateDebut2 = BookHotelRoomOuterClass.Dates.newBuilder()
                .setDay(16)
                .setMonth(11)
                .setYear(1998)
                .build();

        BookHotelRoomOuterClass.Dates dateFin2 = BookHotelRoomOuterClass.Dates.newBuilder()
                .setDay(18)
                .setMonth(11)
                .setYear(1998)
                .build();

        BookHotelRoomOuterClass.Booking booking2 = BookHotelRoomOuterClass.Booking.newBuilder()
                .setNumero(1)
                .setDateDebut(dateDebut2)
                .setDateFin(dateFin2)
                .build();

        BookHotelRoomOuterClass.Book book2 = bookHotelRoomService.bookRoom(booking2);

        System.out.println("Room n°2 : " + (book2.getBookStatus() ? "réussite réservation" : "échec réservation"));

        channel.shutdown();

    }
}
