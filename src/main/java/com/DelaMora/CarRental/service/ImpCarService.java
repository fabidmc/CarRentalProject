package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.typeTransmission;
import com.DelaMora.CarRental.repository.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
    public class ImpCarService implements CarService{

        @Autowired
        private CarDAO carDAO;

        @Override
        @Transactional
        public List<Car> getAllCars() {
            return carDAO.getAllCars();
        }

        @Override
        @Transactional
        public void addCar(Car car){
          carDAO.addCar(car);
        }

        @Override
        @Transactional
        public void deleteCar(Integer carId) {
            carDAO.deleteCar(carId);
        }

        @Override
        @Transactional
        public void updateCar(Car car){
            carDAO.updateCar(car);
        }

        @Override
        @Transactional
        public Car getCarById(int carId){
            return carDAO.getCarById(carId);
        }

        @Override
        @Transactional
        public List<Car>  getCarByTransmission(typeTransmission transmission){
            return carDAO.getCarByTransmission(transmission);
        }


}
















