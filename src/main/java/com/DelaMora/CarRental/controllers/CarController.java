package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/Cars" )

public class CarController {

    @Autowired
    private ImpCarService ImpCarService;

    @GetMapping("/Fleet")
    public String showFleet(HttpSession session, Model model) {

        if (session.getAttribute("fleet") == null) {
            session.setAttribute("fleet", ImpCarService.findAll());
        }
        return "fleet/index";
    }


    @GetMapping( path = "carId/{id}")
    public ResponseEntity<Car> findById(@PathVariable String carId) {
        if (ImpCarService.getCarbyId(carId).isPresent()) {
            return new ResponseEntity<Car>(ImpCarService.getCarbyId(carId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "category/{Category}")
    public ResponseEntity<List<Car>> findByCategory(@PathVariable String CatId){
        return new ResponseEntity<>(ImpCarService.getCarbyCategory(CatId),HttpStatus.OK);
    }


    @GetMapping(path = "brand/{Brands}")
    public ResponseEntity<List<Car>> findByBrand(@PathVariable String brand){
        return new ResponseEntity<>(ImpCarService.getCarbyBrand(brand),HttpStatus.OK);
    }





}























