package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Reservation;
import java.util.Optional;

public interface ReservationService {

   void saveReservation(Reservation reservation);
   void deleteReservation(Long idReservation);
   Optional<Reservation> findByNumReservation(Long idReservation);
   Optional<Reservation> findByClientName(String lastName);

}


