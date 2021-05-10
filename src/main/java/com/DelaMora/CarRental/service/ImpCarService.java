package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
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
        @Transactional(readOnly = true)
        public Optional<Car> findById(Long carId){
            return carDAO.findById(carId);

        }

        public Optional<Car> getAvailableCarsDate(Date pickDate){
            return carDAO.availableCarsForDate(pickDate);
    }

        @Transactional(readOnly = true)
        public List<Car> getCarByCategory(String category){
            return carDAO.findByCategory(category);
        }

        @Transactional(readOnly = true)
        public List<Car> getCarByBrand(String brand){
            return carDAO.findByBrand(brand);
        }

        @Override
        @Transactional(readOnly = true)
        public List<Car> findAll() {
            return (List<Car>) carDAO.findAll();
        }


        @Override
        @Transactional
        public Car saveCar(Car car){
           return carDAO.save(car);
        }


        @Override
        @Transactional
        public void deleteCar(Long carId) {
            carDAO.deleteById(carId);
        }

        @Override
        @Transactional
        public void updateCar(Car car){
            carDAO.save(car);
        }



}














