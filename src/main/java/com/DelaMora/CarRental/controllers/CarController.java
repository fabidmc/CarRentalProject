package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.repository.CarDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {

    @Autowired
    private CarDAO carDAO;

    @Get
    @RequestMapping(value = )
}

