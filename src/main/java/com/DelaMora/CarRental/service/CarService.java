package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> findAll();
    Optional<Car> findById(Long carId);
    Car saveCar(Car car);
    void updateCar(Car car);
    void deleteCar(Long carId);

}


