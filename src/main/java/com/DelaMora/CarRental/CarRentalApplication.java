package com.DelaMora.CarRental;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController

public class CarRentalApplication {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarRentalApplication.class, args);

	}
}


