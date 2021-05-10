package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ClientDAO extends CrudRepository<Client, Long> {


    @Query(value = "SELECT u from Client u where u.idClient = ?1")
    Optional<Client> findByClientId(Long idClient);

    @Query(value = "SELECT u from Client u where u.lastName = ?1")
    Optional<Client> findByLastName(String lastName);

    @Query(value = "SELECT u from Client u where u.userName = ?1")
    Client findByUser(String userName);

}





