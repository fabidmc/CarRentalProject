package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Reservation;

import java.util.Date;
import java.util.Optional;

public interface ReservationService {

   void addReservation(Reservation reservation);
   void deleteReservation(Long idReservation);
   Reservation findByNumReservation(Long idReservation);
   void updateReservation(Reservation reservation);
   Reservation findByDate(Date pickDate);

}


