package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Car;

import java.util.List;


public interface CarDAO {

    public List<Car> findAll(){
        return
    }

    public void addCar(Car car);

    public Car findById(Long carId);

    public List<Car> getCars();

    public void mergeCar(Car car, Car existingCar);



}



