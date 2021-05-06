package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;

import java.util.List;

public interface ImpCar {
    public List<Car> findAll();
    public Car findById(Long carId);
    public List<Car> findByCategory(Long category);



}


