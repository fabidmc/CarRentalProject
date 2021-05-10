package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class CarController {

    @Autowired
    private ImpCarService impCarService;


    @GetMapping("/showAllCars")
    public String showCars(HttpSession session, Model model) {

        if (session.getAttribute("allCars") == null) {
            session.setAttribute("allCars", impCarService.findAll());
        }
        return "showAllCars/index";
    }

    @PostMapping("/cars")
    public String saveCar(HttpSession session, Model model, Car car) {
        if(session.getAttribute("addCars")==null) {
            session.setAttribute("addCars", impCarService.saveCar(car));
        }
        return "cars/addCars";
    }

    @DeleteMapping("/delete")
    public void removeCar(@PathVariable Long carId) {
        impCarService.deleteCar(carId);
    }


}





































