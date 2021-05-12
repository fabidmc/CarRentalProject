package com.DelaMora.CarRental.repository;
import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Category;
import com.DelaMora.CarRental.models.Reservation;
import com.DelaMora.CarRental.models.typeTransmission;
import com.DelaMora.CarRental.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.concurrent.Callable;

@Repository
public class CarDAO {

    private EntityManager entityManager;

    public void addCar(Car car) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(car);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public List<Car> getAllCars() {
        Session currentSession = entityManager.unwrap(Session.class);
       Query<Car> query = currentSession.createQuery("from Car",Car.class);
        List<Car> cars = query.getResultList();
        return cars;
        }


    public void updateCar(Car car) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(car);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteCar(int carId) {
        Transaction transaction = null;
        Car car = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            car = session.get(Car.class, carId);
            session.delete(car);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public Car getCarById(int carId) {
        Transaction transaction = null;
        Car car = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            car = session.get(Car.class, carId);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return car;
    }

    public List<Car> getCarByTransmission(typeTransmission transmission) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Car where transmission =: transmission", Car.class).list();
        }
    }


}

// @Query(value = "SELECT c from Car c where c.category = ?1")
// List<Car> findByCategory(String category);

//@Query(value = "SELECT c from Car c where c.brand = ?1")
// List<Car> findByBrand(String brand);

//@Query(value ="SELECT c from Car c LEFT JOIN Reservation r ON c.plate= r.car.plate WHERE r.pickDate IS NULL")
// Optional<Car> availableCarsForDate(@Param("PickUpDate") Date pickDate) ;






