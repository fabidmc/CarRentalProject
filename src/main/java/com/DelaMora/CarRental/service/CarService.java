package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.typeTransmission;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();
    List<Car> getCarByTransmission(typeTransmission transmission);
    List<Car> getCarById(int carId);
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(Integer carId);
    List<Car> getAvailableCars(boolean av);
}


