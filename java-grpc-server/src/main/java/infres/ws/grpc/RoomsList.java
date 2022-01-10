package infres.ws.grpc;

import java.util.*;

public class RoomsList {

    static HashMap<Integer, Boolean> roomsReservation;
    static HashMap<Integer, Float> roomsPrice;
    static HashMap<Integer, List<DateReservation>> roomsReservationDates;

    private static RoomsList roomsList;

    public static RoomsList getInstance() {
        if(roomsList == null) {
            roomsList = new RoomsList();
        }
        return roomsList;
    }

    private RoomsList() {
        roomsReservation = new HashMap<>();
        roomsPrice = new HashMap<>();
        roomsReservationDates = new HashMap<>();
        for(int i = 1; i < 21; i++) {
            roomsReservation.put(i, false);
            roomsPrice.put(i, new Random().nextFloat() * 100);
            roomsReservationDates.put(i, new ArrayList<>());
        }
    }

    public boolean bookRoom(int roomNum, Date dateDebut, Date dateFin) {
        if(!roomsReservation.get(roomNum)) {
            DateReservation toAdd = null;
            List<DateReservation> dateReservations = roomsReservationDates.get(roomNum);
            if(!dateReservations.isEmpty()) {
                for (DateReservation date : dateReservations) {
                    if (date.dateDebut.after(dateFin) || date.dateFin.before(dateDebut)) {
                        toAdd = new DateReservation(dateDebut, dateFin);
                    }
                }
            }
            else {
                dateReservations.add(new DateReservation(dateDebut, dateFin));
                roomsReservationDates.put(roomNum, dateReservations);
                return true;
            }
            if(toAdd != null) {
                dateReservations.add(toAdd);
                roomsReservationDates.put(roomNum, dateReservations);
                return true;
            }
        }
        return false;
    }

    static class DateReservation {
        public Date dateDebut;
        public Date dateFin;

        public DateReservation(Date dateDebut, Date dateFin) {
            this.dateDebut = dateDebut;
            this.dateFin = dateFin;
        }
    }
}
