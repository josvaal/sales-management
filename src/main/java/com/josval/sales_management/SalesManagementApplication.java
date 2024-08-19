package com.josval.sales_management;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.josval.sales_management")
public class SalesManagementApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();

		System.setProperty("encrypt.secret_key", dotenv.get("ENCRYPT_SECRET_KEY"));

		SpringApplication.run(SalesManagementApplication.class, args);
	}

}
