package com.DelaMora.CarRental.service;

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

    public List<Category> getCategoryById(Long idCategory){
        return categoryDAO.findCategoryById(idCategory);
    }
    
    @Override
    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return (List<Category>) categoryDAO.findAll();
    }


}



