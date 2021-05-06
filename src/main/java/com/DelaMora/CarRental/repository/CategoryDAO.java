package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryDAO extends JpaRepository<Category, Long> {

    @Query(value = "SELECT from CAT_TYPE as u where u.CatId =?1",nativeQuery = true)
    List<Category> findCategorybyId (Long CatId);


}
