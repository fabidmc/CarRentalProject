package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.repository.ReservationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ImpReservationService implements ReservationService {

    @Autowired
    ReservationDAO reservationDAO;

    @Override
    public Reservation findByDate(Date pickDate){
        return reservationDAO.getReservationByDate(pickDate);
    }


    @Override
    @Transactional
    public Reservation findByNumReservation(Long idReservation){
        return reservationDAO.getReservationById(idReservation);
    }

    @Override
    @Transactional
    public void addReservation(Reservation reservation){
        reservationDAO.addReservation(reservation);
    }

    @Override
    @Transactional
    public void deleteReservation(Long idReservation){
        reservationDAO.deleteReservation(idReservation);
    }

    @Override
    public void updateReservation(Reservation reservation){
        reservationDAO.updateReservation(reservation);
    }


}




