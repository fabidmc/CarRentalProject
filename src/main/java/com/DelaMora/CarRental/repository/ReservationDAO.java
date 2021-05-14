package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.models.typeTransmission;
import com.DelaMora.CarRental.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class ReservationDAO  {

    public void addReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(reservation);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateReservation(Reservation reservation) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(reservation);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public void deleteReservation(Long idReservation) {
        Transaction transaction = null;
        Reservation reservation = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            reservation = session.get(Reservation.class, idReservation);
            session.delete(reservation);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Reservation getReservationByDate(Date pickDate) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Reservation where pickDate =: pickDate", Reservation.class).uniqueResult();
        }
    }

    public Reservation getReservationById(Long idReservation) {
        // Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("from Reservation where idReservation=: idReservation");
            query.setParameter("idReservation", idReservation);
            return (Reservation) query.getSingleResult();
            //  transaction = session.beginTransaction();
            //  car = session.get(Car.class, carId);
            // transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }







}



