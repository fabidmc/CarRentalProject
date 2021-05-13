package com.DelaMora.CarRental.controllers;

import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.service.ClientService;
import com.DelaMora.CarRental.service.ImpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/clients")
public class ClientController {


    @Autowired
    ImpClientService impClientService;

    @Autowired
    ClientService clientService;


    @GetMapping(path = "/{id}")
    public Client getClientById(@PathVariable("Id")Long idClient){
        return clientService.findById(idClient);
    }

    @PostMapping
    public void addClient(@RequestBody Client client){
        clientService.addClients(client);
        System.out.println("SUCCESSFULLY ADDED");
    }

    @DeleteMapping(path = "/delete")
    public void removeClient(@PathVariable("Id")Long idClient){
        clientService.deleteClients(idClient);
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Client client){
        clientService.updateClients(client);
    }





}

        /*


        @PostMapping ("/reservation/client/registration")
        public String clientRegistration (HttpSession session, @ModelAttribute ("registration") Client newClient) {
        if (newClient !=null) {
        if (!exists(newClient)) {
        clientService.addClients(newClient);
        } else {
        session.setAttribute("errorUserNameTaken", "Sorry, this Username already exists");
        return "reservation/client/index";
        }
        } else {
        session.setAttribute("errorMessage", "Sorry, make sure to fill all the fields before continue");
        return "reservation/client/index";
        }
        session.setAttribute("client", newClient);
        session.removeAttribute("tempClient");
        return "redirect:/reservation/client";
        }


        public boolean exists (Client client) {
        if (clientService.findById(client.getIdClient()) != null) {
        return true;
        }
        return false;
        }

}

         */


