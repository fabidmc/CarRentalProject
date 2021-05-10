package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Client;

import java.util.List;

public interface ClientService {

    List<Client> findAll();
    void saveClient(Client client);
    //void updateClient(Client client);
    void deleteClient(Client client);

}


