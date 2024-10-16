package com.krikiivo.rest.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RestCountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCountriesApplication.class, args);
	}

}
