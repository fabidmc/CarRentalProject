package com.DelaMora.CarRental.data;

import com.DelaMora.CarRental.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CARRepository extends CrudRepository<Car, Integer>{

    List<Car> newCars();
    List<Car> findAll();



    Car findById(Integer Car_ID);
}