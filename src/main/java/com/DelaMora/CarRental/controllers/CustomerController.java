package com.DelaMora.CarRental.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {


    @RequestMapping(value = "/Customer")

    public String Customer_ID(){
        return "HI";
    };









}
