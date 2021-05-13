package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.models.typeTransmission;
import com.DelaMora.CarRental.service.CarService;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    ImpCarService impCarService;
    @Autowired
    CarService carService;


    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/show/id/{id}")
    public Car showCarById(@PathVariable("id") int carId) {
        return carService.getCarById(carId);
    }

    @GetMapping("/transmission/{transmission}")
    public List<Car> showCarByTransmission(@PathVariable("transmission") typeTransmission transmission) {
        return carService.getCarByTransmission(transmission);
    }


    @PostMapping("/add")
    public ResponseEntity<String> addCar(@RequestBody Car car) {
        carService.addCar(car);
        return new ResponseEntity<>("New car has been added", HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateCar(@RequestBody Car car) {
        carService.updateCar(car);
        return new ResponseEntity<>("Car has been updated", HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable("id") Integer carId) {
        carService.deleteCar(carId);
        return new ResponseEntity<>("Car has been deleted", HttpStatus.OK);
    }


}



 /*   @PostMapping("/showAllCars/filter")
    public String filterCarFleet(HttpSession session,
                                 @RequestParam(name="categorySelection") String categoryValue,
                                 @RequestParam(name="brandSelection") String brandValue)
                                  {

        List<Car> allCars = impCarService.findAllCars();
        List<Car> filteredCars = new ArrayList<Car>();

        if (!categoryValue.isEmpty()) {
            session.setAttribute("category", categoryValue);
            for (Car c : allCars) {
                if (c.getCategory().getTypeCategory().equalsIgnoreCase(categoryValue)) {
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




}

}



  */










































