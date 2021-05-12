package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.typeTransmission;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getAllCars();
    List<Car> getCarByTransmission(typeTransmission transmission);
    Car getCarById(int carId);
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(Integer carId);


}


