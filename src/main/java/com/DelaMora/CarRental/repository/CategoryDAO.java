package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Category;
import com.DelaMora.CarRental.models.typeTransmission;
import com.DelaMora.CarRental.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAO {

    public List<Category> getCarByType(String typeCategory) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Category where typeCategory =: typeCategory", Category.class).list();
        }
    }

    public List<Category> getAllCategories() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Category", Category.class).list();
        }
    }


}






