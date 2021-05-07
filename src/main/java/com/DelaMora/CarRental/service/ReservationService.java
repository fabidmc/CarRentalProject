package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Reservations;

public interface ReservationService {


   void addReservation(Reservations reservations);

   void deleteReservation(String BookingId);



}
