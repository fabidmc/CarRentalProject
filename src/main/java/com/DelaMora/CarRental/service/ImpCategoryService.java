package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Category;
import com.DelaMora.CarRental.repository.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("CategoryService")
@Transactional
public class ImpCategoryService implements  CategoryService{

    @Autowired
    private CategoryDAO categoryDAO;

    public List<Category> getCategoryById(Long CatId){
        return categoryDAO.findCategorybyId(CatId);
    }

    @Override
    public List<Category> findAll() {
        return categoryDAO.findAll();
    }


}
