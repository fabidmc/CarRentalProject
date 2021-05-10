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

    @Transactional(readOnly = true)
    public List<Reservation> getByDate(Date pickDate){
        return reservationDAO.findByDate(pickDate);
    }

    public Optional<Reservation> findByClientName(String lastName) {
        return reservationDAO.findByClientName(lastName);
    }

    public Optional<Reservation> getReservationByCarPlate(String plate){
        return reservationDAO.findByCarPlate(plate);
    }

    @Override
    @Transactional
    public Optional<Reservation> findByNumReservation(Long idReservation){
        return reservationDAO.findById(idReservation);
    }

    @Override
    @Transactional
    public void saveReservation(Reservation reservation){
        reservationDAO.save(reservation);
    }

    @Override
    @Transactional
    public void deleteReservation(Long idReservation){
        reservationDAO.deleteById(idReservation);
    }


}


