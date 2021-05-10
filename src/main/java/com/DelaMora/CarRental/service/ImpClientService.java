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

    @Transactional
    public Optional<Client> getClientById(Long idClient){
        return clientDAO.findByClientId(idClient);

    }

    @Transactional
    public Optional<Client> getClientByLastName(String lastName){
        return clientDAO.findByLastName(lastName);
    }

    @Transactional
    public Client getClientByUser(String userName){
        return clientDAO.findByUser(userName);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return (List<Client>) clientDAO.findAll();
    }


    @Override
    @Transactional
    public void saveClient(Client client){
        clientDAO.save(client);
    }

    @Override
    @Transactional
    public void deleteClient(Client client) {
        clientDAO.delete(client);
    }


}

