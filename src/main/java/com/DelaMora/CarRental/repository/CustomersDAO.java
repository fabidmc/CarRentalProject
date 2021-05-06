package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface CustomersDAO extends JpaRepository<Customers, String> {


        @Query(value = "SELECT u from CUSTOMERS u where u.customerId = ?1")
        Optional<Customers> findByCustomerId(String customerId);

        @Query(value = "SELECT u from CUSTOMERS u where u.lastName = ?1")
        Optional<Customers> findByLastName(String lastName);


    }