package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;

import java.util.List;

public interface CarService {

    public List<Car> findAll();

    public void addNewCar(Car car);

    public void updateCar(Car car);

    public void deleteCar(String carId);


}
