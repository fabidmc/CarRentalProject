package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationsRepository extends JpaRepository<Reservations, Long> {
}