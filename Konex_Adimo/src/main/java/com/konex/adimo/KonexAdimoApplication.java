package com.konex.adimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KonexAdimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KonexAdimoApplication.class, args);
		//System.out.print(new BCryptPasswordEncoder().encode("123456"));
	}

}
