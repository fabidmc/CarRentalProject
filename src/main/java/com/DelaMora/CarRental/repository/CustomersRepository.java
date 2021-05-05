package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
}