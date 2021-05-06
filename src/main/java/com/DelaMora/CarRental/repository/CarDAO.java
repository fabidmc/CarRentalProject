package com.DelaMora.CarRental.repository;
import com.DelaMora.CarRental.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface CarDAO extends JpaRepository<Car,String> {


    @Query(value = "SELECT c from CAR c where c.carId = ?1")
    Optional<Car> findById(String carId);


    @Query(value = "SELECT c from CAR c where c.CatId = ?1")
    List<Car> findByCategory(String CatId);

    @Query(value = "SELECT c from CAR c where c.brand = ?1")
    List<Car> findByBrand(String brand);





}



