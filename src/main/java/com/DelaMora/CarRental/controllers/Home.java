package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class Home {

        @GetMapping("/")
        public String showHome (HttpSession session, Model model) {
            Reservation rent = new Reservation();
            session.setAttribute("reservation", rent);
            return "index";
        }

        @PostMapping("/")
        public String setDatesToRent(HttpSession session, @ModelAttribute("reservation") Reservation rent) {

            if (initDateIsBeforeFinalDate(rent)) {
                session.setAttribute("reservation", rent);
            } else {
                session.setAttribute("errorInReservationDates", "Pick up date must be before return date!");
                return "redirect:/";
            }
            return "redirect:/reservation/vehicleSelect";
        }

        public boolean initDateIsBeforeFinalDate(Reservation rent) {
            if (rent.getPickDate().compareTo(rent.getReturnDate()) > 0) {
                return false;
            } else {
                return true;
            }
        }
}
