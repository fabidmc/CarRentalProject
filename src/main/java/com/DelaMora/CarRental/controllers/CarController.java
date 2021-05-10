package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.service.ImpCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private ImpCarService impCarService;




    //create a new car
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Car car) {
        return ResponseEntity.status(HttpStatus.CREATED).body(impCarService.saveCar(car));
    }

    @GetMapping("/{carId}")
    public ResponseEntity<?> showCarById(@PathVariable Long carId) {
        Optional<Car> oCar = impCarService.findById(carId);

        if (!oCar.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oCar);
    }

}
    /*@GetMapping("showAllCars/")
    public String findAll(Model model){
        List<Car> showAllCars = impCarService.findAll();
        model.addAttribute("allCars",showAllCars);
        return "showAllCars";
    }

    @GetMapping( "/{carId}")
    public String findById(@RequestParam(name = "carId")  Long carId, Model model) {
           Car car = impCarService.findById(carId);
            model.addAttribute("car",car);
            return "detail/{carId}";
        }



    @GetMapping("category/")
    public String findByCategory(@RequestParam(name = "category") String category, Model model){
        List<Car> cars = impCarService.getCarByCategory(category);
        model.addAttribute("allCarsByCategory",cars);
        return "category/{CatId}";
       // return new ResponseEntity<>(impCarService.getCarbyCategory(CatId),HttpStatus.OK);
    }


    @GetMapping("brand/")
    public String findByBrand(@RequestParam(name = "brand") String brand, Model model){
         List<Car>  carBrand = impCarService.getCarByBrand(brand);
         model.addAttribute("carBrand", carBrand);
         return "brand/{brand}";
    }



    @DeleteMapping
    public void deleteCar(@PathVariable Long carId){
        impCarService.deleteCar(carId);
    }

    @PutMapping
    public void updateCar(Car car) {
        impCarService.updateCar(car);
    }




}

*/


























