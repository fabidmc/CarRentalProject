package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;

import java.util.List;

public interface CarService {

    List<Car> findAll();

    void addNewCar(Car car);

    void updateCar(Car car);

    void deleteCar(String carId);


}
