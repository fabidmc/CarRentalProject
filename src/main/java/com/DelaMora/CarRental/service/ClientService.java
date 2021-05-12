package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAllClients();
    void addClients(Client client);
    void updateClients(Client client);
    void deleteClients(Long idClient);
    Client findById(Long idClient);

}


