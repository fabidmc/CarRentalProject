/*package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.service.ImpReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


@RestController

    public class ReservationController {

    @Autowired
    private ImpReservationService impReservationService;

    @GetMapping("/reservation/confirmation")
    public String showConfirmation (Model model, HttpSession session) {

        Reservation reservation = (Reservation) session.getAttribute("reservation");
        Car car = (Car) session.getAttribute("car");
        return "/reservation/confirmation/index";
    }


    @PostMapping
    public void addReservation(@RequestBody Reservation reservation) {
        impReservationService.saveReservation(reservation);
    }

    @DeleteMapping
    public void deleteReservation(@PathVariable Long idReservation) {
        impReservationService.deleteReservation(idReservation);

    }

}


 */




