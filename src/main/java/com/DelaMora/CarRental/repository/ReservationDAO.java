package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface ReservationDAO extends CrudRepository<Reservation, Long> {

    @Query(value = "SELECT r from Reservation r where r.pickDate = ?1")
   List<Reservation> findByDate(Date pickDate);

    @Query(value = "SELECT r from Reservation r where r.client.lastName = ?1")
  Optional<Reservation> findByClientName(String lastName);

    @Query(value = "SELECT r from Reservation r where r.car.plate = ?1")
    Optional<Reservation> findByCarPlate(String plate);





}



