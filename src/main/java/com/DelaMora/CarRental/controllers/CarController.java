package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/Cars" )

public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping( path = "carId/{id}")
    public ResponseEntity<Car> findById(@PathVariable String carId) {
        if (carService.getCarbyId(carId).isPresent()) {
            return new ResponseEntity<Car>(carService.getCarbyId(carId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "category/{Category}")
    public ResponseEntity<List<Car>> findByCategory(@PathVariable String CatId){
        return new ResponseEntity<>(carService.getCarbyCategory(CatId),HttpStatus.OK);
    }


    @GetMapping(path = "brand/{Brands}")
    public ResponseEntity<List<Car>> findByBrand(@PathVariable String brand){
        return new ResponseEntity<>(carService.getCarbyBrand(brand),HttpStatus.OK);
    }




}























