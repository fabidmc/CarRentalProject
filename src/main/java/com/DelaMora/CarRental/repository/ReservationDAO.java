package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public interface ReservationDAO extends JpaRepository<Reservations, String> {

    @Query(value = "SELECT from RESERVATION as u where u.pickDate = ?1",nativeQuery = true)
    List<Reservations> findByDate(LocalDateTime pickDate);

    @Query(value = "SELECT from RESERVATION as u where u.customers.customerId = ?1",nativeQuery = true)
    Optional<Reservations> findByCustomerId(String customerId);

    @Query(value = "SELECT from RESERVATION as u where u.car.carId = ?1",nativeQuery = true)
    Optional<Reservations> findByCarId(String carId);





}
