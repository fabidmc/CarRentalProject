package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


public interface ReservationDAO extends JpaRepository<Reservations, String> {

    @Query(value = "SELECT u from RESERVATION u where u.pickDate = ?1")
    List<Reservations> findByDate(LocalDateTime pickDate);

    @Query(value = "SELECT u from RESERVATION u where u.customers.customerId = ?1")
    Optional<Reservations> findByCustomerId(String customerId);

    @Query(value = "SELECT u from RESERVATION u where u.car.carId = ?1")
    Optional<Reservations> findByCarId(String carId);
}
