package com.DelaMora.CarRental.service;


import com.DelaMora.CarRental.models.Reservations;
import com.DelaMora.CarRental.repository.ReservationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service("ReservationService")
@Transactional
public class ImpReservationService implements ReservationService {

    @Autowired
    ReservationDAO reservationDAO;

    public List<Reservations> getReservationByDate(LocalDateTime pickDate){
        return reservationDAO.findByDate(pickDate);
    }

    public Optional<Reservations> getReservationByCustomerId(String customerId){
        return reservationDAO.findByCustomerId(customerId);
    }

    public Optional<Reservations> getReservationByCarId(String carId){
        return reservationDAO.findByCarId(carId);
    }

    public Optional<Reservations> getReservationById(String BookingId){
        return reservationDAO.findById(BookingId);
    }

    @Override
    public void addReservation(Reservations reservations){
        reservationDAO.save(reservations);
    }

    @Override
    public void deleteReservation(String BookingId){
        reservationDAO.deleteById(BookingId);
    }



}
