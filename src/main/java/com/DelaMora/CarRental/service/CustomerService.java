package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Customers;

import java.util.List;

public interface CustomerService {

    List<Customers> findAll();

    void addClient(Customers customers);

    void deleteClient(Customers customers);



}
