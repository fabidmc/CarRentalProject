package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Reservations;
import com.DelaMora.CarRental.service.ImpReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/Reservation")

    public class ReservationController {

    @Autowired
    private ImpReservationService impReservationService;


   // @GetMapping( path = "pickDate/{date}")
    //public ResponseEntity<Reservations> findByDate(@PathVariable LocalDateTime pickDate) {
    //    return new ResponseEntity<Reservations>(reservationService.getReservationByDate(pickDate,HttpStatus.OK));
   // }

    @GetMapping(path = "CustomerId/{customerId}")
    public ResponseEntity<Reservations> findByCustomerId(@PathVariable String customerId){

        if (impReservationService.getReservationByCustomerId(customerId).isPresent()) {
            return new ResponseEntity<Reservations>(impReservationService.getReservationByCustomerId(customerId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Reservations>(HttpStatus.NOT_FOUND);
    }


    @GetMapping(path = "CarId/{carId}")
    public ResponseEntity<Reservations> findByCarId(@PathVariable String carId){

        if (impReservationService.getReservationByCarId(carId).isPresent()) {
            return new ResponseEntity<Reservations>(impReservationService.getReservationByCarId(carId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Reservations>(HttpStatus.NOT_FOUND);
    }



}



