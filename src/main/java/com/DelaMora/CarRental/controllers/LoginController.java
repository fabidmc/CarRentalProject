package com.DelaMora.CarRental.controllers;


import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.service.ImpClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


        @Autowired
        ImpClientService impClientService;


        @GetMapping("/user/login")
        public String showLoginForm (HttpServletRequest request, HttpServletResponse response, Model model) {
                return "user/login/index";
        }

        @PostMapping("/user/login")
        public String loginProcess (HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login, HttpSession session) {

        Client client = impClientService.getClientByUser(login.getUserName());

        if (null != login && client != null && client.getPassword().equals(login.getPassword())) {
        session.setAttribute("client", client);
        } else {
        session.setAttribute("errorUserAuth", "Username or password is wrong!");
        return "user/login/index";
        }
        return "redirect:/";
        }

        @GetMapping("/user/registration")
        public String showRegisterForm (HttpServletRequest request, HttpServletResponse response) {
        Client client = new Client();
        HttpSession session = request.getSession(true);
        session.setAttribute("tempClient", client);
        return "user/registration/index";
        }

        @PostMapping("/user/registration")
        public String registerProcess (HttpSession session, @ModelAttribute ("registration") Client newClient) {

        if (newClient !=null) {
        if (!exists(newClient)) {
        impClientService.saveClient(newClient);
        } else {
        session.setAttribute("errorUserNameTaken", "Sorry, this Username already exists");
        return "user/registration/index";
        }
        } else {
        session.setAttribute("errorMessage", "Sorry, make sure to fill all the fields before continue");
        return "user/registration/index";

        }
        session.setAttribute("client", newClient);
        session.removeAttribute("tempClient");
        return "redirect:/";
        }

        public boolean exists (Client client) {
        if (impClientService.getClientByUser(client.getUserName()) != null) {
        return true;
        }
        return false;
        }

}





