package com.DelaMora.CarRental.data;

import com.DelaMora.CarRental.models.CUSTOMERS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CUSTOMERSRepository extends JpaRepository<CUSTOMERS, Integer>, JpaSpecificationExecutor<CUSTOMERS> {

}