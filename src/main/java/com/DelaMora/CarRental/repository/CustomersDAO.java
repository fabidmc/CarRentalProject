package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface CustomersDAO extends JpaRepository<Customers, String> {


        @Query(value = "SELECT from CUSTOMERS as u where u.customerId = ?1",nativeQuery = true)
        Optional<Customers> findByCustomerId(String customerId);

        @Query(value = "SELECT from CUSTOMERS as u where u.lastName = ?1",nativeQuery = true)
        Optional<Customers> findByLastName(String lastName);


}