package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.repository.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service("CarService")
@Transactional

    public class CarService{

        @Autowired
        private CarDAO carDAO;


        public Optional<Car> getCarbyId(String carId){
            return carDAO.findById(carId);

        }

        public List<Car> getCarbyCategory(String CatId){
            return carDAO.findByCategory(CatId);
        }


        public List<Car> getCarbyBrand(String brand){
            return carDAO.findByBrand(brand);
        }

        public List<Car> findAll(){
            return (List<Car>) carDAO.findAll();
        }






}
