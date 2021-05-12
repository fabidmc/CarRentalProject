package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.service.ImpReservationService;
import com.DelaMora.CarRental.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(path = "/reservation")
public class ReservationController {


    @Autowired
    ImpReservationService impReservationService;
    @Autowired
    ReservationService reservationService;

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
















