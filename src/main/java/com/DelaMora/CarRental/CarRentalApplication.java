package com.DelaMora.CarRental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class CarRentalApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarRentalApplication.class, args);


	}
}


