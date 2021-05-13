package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.service.ImpReservationService;
import com.DelaMora.CarRental.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "/reservation")
public class ReservationController {


    @Autowired
    ImpReservationService impReservationService;
    @Autowired
    ReservationService reservationService;


    @GetMapping(path="/{Id}")
    public void getReservationsById(@PathVariable("Id")Long idReservation){
        reservationService.findByNumReservation(idReservation);
    }

    @PostMapping
    public void addReservation(@RequestBody Reservation reservation){
        reservationService.addReservation(reservation);
    }

    @DeleteMapping
    public void deleteReservation(Long idReservation){
        reservationService.deleteReservation(idReservation);
    }

    @PutMapping("/update")
    public void updateReservation(@RequestBody Reservation reservation){
        reservationService.updateReservation(reservation);
    }

    @GetMapping("/confirmation")
    public String showConfirmation (Model model, HttpSession session) {

        Reservation rent = (Reservation) session.getAttribute("reservation");
        Car car = (Car) session.getAttribute("car");
        return "confirmation/index";
    }



    @PostMapping("/reservation/confirmation")
    public String processConfirmation(HttpSession session) {
        Reservation rent = (Reservation) session.getAttribute("reservation");
        Client client = (Client) session.getAttribute("client");

        Long rentNumber = createReservation.createReservationNumber(client, rent);

        rent.setIdReservation(rentNumber);
        reservationService.addReservation(rent);

        session.setAttribute("reservation", rent);

        return "redirect:success";
    }

}
















