package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/car" )

public class CarController {

    @Autowired
    private ImpCarService impCarService;



    @GetMapping( path = "/carId/{id}")
    public ResponseEntity<Car> findById(@PathVariable String carId) {
        if (impCarService.getCarbyId(carId).isPresent()) {
            return new ResponseEntity<Car>(impCarService.getCarbyId(carId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Car>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/category/{Category}")
    public ResponseEntity<List<Car>> findByCategory(@PathVariable String CatId){
        return new ResponseEntity<>(impCarService.getCarbyCategory(CatId),HttpStatus.OK);
    }


    @GetMapping(path = "/brand/{Brands}")
    public ResponseEntity<List<Car>> findByBrand(@PathVariable String brand){
        return new ResponseEntity<>(impCarService.getCarbyBrand(brand),HttpStatus.OK);
    }

    @GetMapping
    public List<Car> findAll(){
        return impCarService.findAll();
    }

    @PostMapping
    public void addNewCar(@RequestBody Car car){
        impCarService.addNewCar(car);
    }

    @DeleteMapping
    public void deleteCar(@PathVariable String carId){
        impCarService.deleteCar(carId);
    }

    @PutMapping
    public void updateCar(Car car) {
        impCarService.updateCar(car);
    }




}























