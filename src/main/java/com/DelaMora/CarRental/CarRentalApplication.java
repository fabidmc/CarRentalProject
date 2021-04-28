package com.DelaMora.CarRental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootApplication
@RestController

public class CarRentalApplication {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarRentalApplication.class, args);


		try {
			String url = "jdbc:mysql://localhost:3306/CarSystem";
			String user = "root";
			String passwd = "Luzdeluna-27";

			Connection conn = DriverManager.getConnection(url, user, passwd);
			//Class.forName(Driver);
			System.out.println("Connected");
			//return conn;

		} catch (SQLException e) {
			System.out.println("BLA BLA");
		}


	}
}


