package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Customers;
import com.DelaMora.CarRental.service.ImpCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/Customers")

public class CustomerController {

    @Autowired
    private ImpCustomerService impCustomerService;

    @GetMapping(path = "CustomerId/{id}")
    public ResponseEntity<Customers> findByCustomerId(@PathVariable String customerId){

        if (impCustomerService.getCustomerbyId(customerId).isPresent()) {
            return new ResponseEntity<Customers>(impCustomerService.getCustomerbyId(customerId).get(), HttpStatus.OK);
        }
        return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
    }


    @GetMapping(path = "LastName/{lastName}")
    public ResponseEntity<Customers> findByLastName(@PathVariable String lastName){
        if (impCustomerService.getCustomerbyLastName(lastName).isPresent()){
            return new ResponseEntity<Customers>(impCustomerService.getCustomerbyLastName(lastName).get(),HttpStatus.OK);
        }
        return new ResponseEntity<Customers>(HttpStatus.NOT_FOUND);
    }

    }









