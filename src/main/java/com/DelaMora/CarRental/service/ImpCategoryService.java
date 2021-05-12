package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Car;
import com.DelaMora.CarRental.models.Category;
import com.DelaMora.CarRental.repository.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpCategoryService implements  CategoryService{

    @Autowired
    private CategoryDAO categoryDAO;


    @Override
    public List<Category> findAllCategories() {
     return categoryDAO.getAllCategories();
    }

    @Override
    public List<Category> findByTypes(String typeCategory){
        return categoryDAO.getCarByType(typeCategory);
    }



}





