package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Reservations;
import com.DelaMora.CarRental.service.ImpReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping(path = "/Reservation")

    public class ReservationController {

    @Autowired
    private ImpReservationService impReservationService;


    @GetMapping( path = "/pickDate/{date}")
    public List<Reservations> findByDate(@PathVariable LocalDateTime pickDate) {
      return impReservationService.getReservationByDate(pickDate);
     }

    @GetMapping(path = "/CustomerId/{customerId}")
    public ResponseEntity<Reservations> findByCustomerId(@PathVariable String customerId) {

        if (impReservationService.getReservationByCustomerId(customerId).isPresent()) {
            return new ResponseEntity<Reservations>(impReservationService.getReservationByCustomerId(customerId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Reservations>(HttpStatus.NOT_FOUND);
    }


    @GetMapping(path = "/CarId/{carId}")
    public ResponseEntity<Reservations> findByCarId(@PathVariable String carId) {

        if (impReservationService.getReservationByCarId(carId).isPresent()) {
            return new ResponseEntity<Reservations>(impReservationService.getReservationByCarId(carId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Reservations>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/BookingId/{BookingId}")
    public ResponseEntity<Reservations> findById(@PathVariable String BookingId){
        return new ResponseEntity<Reservations>(impReservationService.getReservationById(BookingId).get(),HttpStatus.BAD_REQUEST);
    }

    @PostMapping
    public void addReservation(@RequestBody Reservations reservations) {
        impReservationService.addReservation(reservations);
    }

    @DeleteMapping
    public void deleteReservation(@PathVariable String BookingId) {
        impReservationService.deleteReservation(BookingId);


    }

}



