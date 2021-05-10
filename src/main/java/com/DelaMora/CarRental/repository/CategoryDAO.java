package com.DelaMora.CarRental.repository;

import com.DelaMora.CarRental.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CategoryDAO extends CrudRepository<Category, Long> {

    @Query(value = "SELECT t from Category t where t.idCategory =?1")
     List<Category> findCategoryById (Long idCategory);


}




