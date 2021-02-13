package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:publish-subscribe.xml")
public class DemoApplication implements CommandLineRunner {

	@Autowired Customer customer;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customer.placeOrder();
		try {
			Thread.sleep(2000L);
		} catch (Exception e) {

		}
	}
}
