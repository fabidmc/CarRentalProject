package com.DelaMora.CarRental.service;


import com.DelaMora.CarRental.models.Car;
import java.util.List;

public interface CarService {

    List<Car> findAll();
    List<Car> newcars();

    Car findById(Long Car_ID);
    void save(Car car);



}
