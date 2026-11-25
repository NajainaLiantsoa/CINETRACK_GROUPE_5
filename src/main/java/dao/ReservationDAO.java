package dao;

import java.util.List;

import model.Reservation;

public interface ReservationDAO {

    void insererReservation(Reservation reservation);

    void annulerReservation(int idReservation);

    Reservation rechercherReservation(int idReservation);

    List<Reservation> getAllReservations();
}
