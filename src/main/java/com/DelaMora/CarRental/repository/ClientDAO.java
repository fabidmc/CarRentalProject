package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Client;
import com.DelaMora.CarRental.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientDAO {


    public void addClient(Client client) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction =session.beginTransaction();
            session.save(client);
            session.getTransaction().commit();;
            //transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Client> getAllClients() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Client", Client.class).list();
        }
    }

    public void updateClient(Client client) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(client);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Client> getClientById(Long idClient) {
        // Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Client where idClient=: idClient");
            query.setParameter("idClient",idClient);
            return query.list();
            //  transaction = session.beginTransaction();
            //  car = session.get(Car.class, carId);
            // transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteClient(Long idClient) {
        Transaction transaction = null;
        Client client = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            client = session.get(Client.class, idClient);
            session.delete(client);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }




}






