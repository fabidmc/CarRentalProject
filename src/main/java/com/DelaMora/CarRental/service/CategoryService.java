package com.DelaMora.CarRental.service;

import com.DelaMora.CarRental.models.Category;
import java.util.List;

public interface CategoryService {

    List<Category> findByTypes(String typeCategory);
    List<Category> findAllCategories();

}



