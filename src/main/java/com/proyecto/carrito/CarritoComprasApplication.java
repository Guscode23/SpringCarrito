package com.proyecto.carrito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class CarritoComprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoComprasApplication.class, args);
	}

}
