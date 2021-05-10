package com.DelaMora.CarRental.repository;
import com.DelaMora.CarRental.models.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;
import java.util.Date;

@Repository
public interface CarDAO extends CrudRepository<Car, Long> {

    @Query(value = "SELECT c from Car c where c.category = ?1")
    List<Car> findByCategory(String category);

    @Query(value = "SELECT c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);

    @Query(value ="SELECT c from Car c LEFT JOIN Reservation r ON c.plate= r.car.plate WHERE r.pickDate IS NULL")
    Optional<Car> availableCarsForDate(@Param("PickUpDate") Date pickDate) ;

}







