package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Customers;

import java.util.List;

public interface CustomerService {

    public List<Customers> findAll();

    public void save(Customers customers);

    public void delete(Customers customers);



}
