package infres.ws.grpc;

import grpc.BookHotelRoomGrpc;
import grpc.BookHotelRoomOuterClass;
import io.grpc.stub.StreamObserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookHotelRoom extends BookHotelRoomGrpc.BookHotelRoomImplBase {

    @Override
    public void getRoom(BookHotelRoomOuterClass.RoomNumber request,
            StreamObserver<BookHotelRoomOuterClass.RoomData> responseObserver) {

        int roomNumber = request.getNumero();

        BookHotelRoomOuterClass.RoomData roomData = BookHotelRoomOuterClass.RoomData.newBuilder()
                .setType(RoomsList.getInstance().getType(roomNumber))
                .setPrice(RoomsList.getInstance().getPrice(roomNumber))
                .build();

        responseObserver.onNext(roomData);
        responseObserver.onCompleted();
    }

    @Override
    public void bookRoom(BookHotelRoomOuterClass.Booking request,
            StreamObserver<BookHotelRoomOuterClass.Book> responseObserver) {
        Date dateDebut = null, dateFin = null;
        try {
            dateDebut = dateToDate(request.getDateDebut());
            dateFin = dateToDate(request.getDateFin());
        } catch (ParseException ignored) {
        }

        BookHotelRoomOuterClass.Book book = BookHotelRoomOuterClass.Book.newBuilder()
                .setBookStatus(RoomsList.getInstance().bookRoom(request.getNumero(), dateDebut, dateFin))
                .build();

        responseObserver.onNext(book);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllRoom(BookHotelRoomOuterClass.Empty request, StreamObserver<BookHotelRoomOuterClass.RoomNumbers> responseObserver) {

        BookHotelRoomOuterClass.RoomNumbers.Builder roomsBuilder = BookHotelRoomOuterClass.RoomNumbers.newBuilder();

        for(Integer i : RoomsList.getInstance().getIds()) {
            roomsBuilder.setRoomNumber(i, BookHotelRoomOuterClass.RoomNumber.newBuilder().setNumero(i).build());
        }

        responseObserver.onNext(roomsBuilder.build());
        responseObserver.onCompleted();
    }

    private Date dateToDate(BookHotelRoomOuterClass.Dates date) throws ParseException {
        String day = String.valueOf(date.getDay());
        day = day.length() == 1 ? "0".concat(day) : day;
        String month = String.valueOf(date.getMonth());
        month = month.length() == 1 ? "0".concat(month) : month;
        String year = String.valueOf(date.getYear());
        while (year.length() < 4) {
            year = "0".concat(year);
        }
        return new SimpleDateFormat("dd/MM/yyyy").parse(day.concat("/" + month).concat("/" + year));
    }
}
