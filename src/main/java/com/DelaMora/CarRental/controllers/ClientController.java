package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.models.Login;
import com.DelaMora.CarRental.service.ImpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ClientController{


    @Autowired
	ImpClientService impClientService;

    @GetMapping("/reservation/Client")
    public String showCustomerDetailsForm () {
        return "/reservation/Client/index";
        }

    @PostMapping ("/reservation/Client")
    public String loginProcess (@ModelAttribute("login") Login login, HttpSession session) {

        Client client = impClientService.getClientByUser(login.getUserName());

        if (null != login && client != null && client.getPassword().equals(login.getPassword())) {
        session.setAttribute("client", client);
        } else {
        session.setAttribute("errorUserAuth", "Username or password is wrong!");
        return "reservation/Client/index";
        }
        return "redirect:/reservation/Client";
        }

        @PostMapping ("/reservation/Client/registration")
        public String clientRegistration (HttpSession session, @ModelAttribute ("registration") Client newClient) {
        if (newClient !=null) {
        if (!exists(newClient)) {
        impClientService.saveClient(newClient);
        } else {
        session.setAttribute("errorUserNameTaken", "Sorry, this Username already exists");
        return "reservation/Client/index";
        }
        } else {
        session.setAttribute("errorMessage", "Sorry, make sure to fill all the fields before continue");
        return "reservation/Client/index";
        }
        session.setAttribute("client", newClient);
        session.removeAttribute("tempClient");
        return "redirect:/reservation/Client";
        }


        public boolean exists (Client client) {
        if (impClientService.getClientByUser(client.getUserName()) != null) {
        return true;
        }
        return false;
        }

}
