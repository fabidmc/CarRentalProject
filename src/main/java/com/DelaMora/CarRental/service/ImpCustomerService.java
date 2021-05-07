package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Customers;
import com.DelaMora.CarRental.repository.CustomersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("CustomerService")
@Transactional

public class ImpCustomerService implements CustomerService{

    @Autowired
    private CustomersDAO customersDAO;

    public Optional<Customers> getCustomerbyId(String customerId){
        return customersDAO.findByCustomerId(customerId);

    }

    public Optional<Customers> getCustomerbyLastName(String lastName){
        return customersDAO.findByLastName(lastName);
    }


    @Override
    public List<Customers> findAll() {
        return customersDAO.findAll();
    }


    @Override
    public void addClient(Customers customers){
        customersDAO.save(customers);
    }


    @Override
    public void deleteClient(Customers customers) {
        customersDAO.delete(customers);
    }



}
