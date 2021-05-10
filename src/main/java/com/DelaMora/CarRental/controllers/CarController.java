package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    ImpCarService impCarService;

    @GetMapping("/showAllCars")
    public String showCars(HttpSession session, Model model) {

        if (session.getAttribute("showAllCars") == null) {
            session.setAttribute("showAllCars", impCarService.findAll());
        }
        return "showAllCars/index";
    }


    @GetMapping("/selectCar")
    public String showPeriodSelector(HttpSession session, @ModelAttribute("reservation") Reservation rent, @RequestParam("id") Long carId) {
        session.setAttribute("car", impCarService.findById(carId));
        rent.setCategory(impCarService.findById(carId).get().getCategory());
        session.setAttribute("reservation", rent);
        return "redirect:/reservation/dateSelection/";
    }

    @PostMapping("/showAllCars/filter")
    public String filterCarFleet(HttpSession session,
                                 @RequestParam(name="categorySelection") String categoryValue,
                                 @RequestParam(name="brandSelection") String brandValue,
                                 @RequestParam(name="priceOrderSelection") String priceOrderValue) {

        List<Car> allCars = impCarService.findAll();
        List<Car> filteredCars = new ArrayList<Car>();

        if (!categoryValue.isEmpty()) {
            session.setAttribute("category", categoryValue);
            for (Car c : allCars) {
                if (c.getCategory().getType().equalsIgnoreCase(categoryValue)) {
                    filteredCars.add(c);
                }
            }
            allCars.clear();
            allCars.addAll(filteredCars);
        }else {
            session.removeAttribute("category");
        }

        if (brandValue != null) {
            session.setAttribute("brand", brandValue.toString());
            filteredCars.clear();
            for (Car c : allCars) {
                if (c.getBrand().equals(brandValue)) {
                    filteredCars.add(c);
                }
            }
            allCars.clear();
            allCars.addAll(filteredCars);
        } else {
            session.removeAttribute("brand");
        }

        session.setAttribute("allCars", filteredCars);

        return "redirect:/showAllCars";
    }

    @GetMapping("/reservation/vehicleSelect")
    public String showVehicleList (HttpSession session, Model model) {

        Reservation rent = (Reservation) session.getAttribute("reservation");
        if (session.getAttribute("allCars") == null) {
            session.setAttribute("allCars", impCarService.findAll());
        }
        return "reservation/vehicleSelect/index";
    }

    @GetMapping("/reservation/vehicleSelect/selectCar")
    public String showPeriodSelector(HttpSession session, @RequestParam("id") Long carId) {

        session.setAttribute("car", impCarService.findById(carId));
        Reservation rent = (Reservation) session.getAttribute("reservation");
        rent.setCategory(impCarService.findById(carId).get().getCategory());
        session.setAttribute("reservation", rent);

        return "redirect:/reservation/extras";
    }

    @PostMapping("/reservation/vehicleSelect")
    public String changeDates(@ModelAttribute("reservation") Reservation newDates, HttpSession session) {
        Reservation rent = (Reservation) session.getAttribute("reservation");

        if (newDates.getPickDate() != null) {
            rent.setPickDate(newDates.getPickDate());
        }

        if (newDates.getReturnDate() != null) {
            rent.setReturnDate(newDates.getReturnDate());
        }

        if (initDateIsBeforeFinalDate(rent)) {
            session.setAttribute("reservation", rent);
        } else {
            session.setAttribute("errorDates", "Pick up date must be before return date!");
            return "/reservation/dateSelection/index";
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










































