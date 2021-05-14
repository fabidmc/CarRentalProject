package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.repository.ClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ImpClientService implements ClientService{

    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<Client> findById(Long idClient){
        return clientDAO.getClientById(idClient);

    }


    @Override
    public List<Client> findAllClients() {
       return clientDAO.getAllClients();
    }


    @Override
    public void addClients(Client client){
        clientDAO.addClient(client);
    }


    @Override
    public void deleteClients(Long idClient) {
        clientDAO.deleteClient(idClient);
    }


    @Override
    public void updateClients(Client client){
        clientDAO.updateClient(client);
    }
}



