package com.projeto.countryguesser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.projeto.countryguesser")
public class CountryguesserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryguesserApplication.class, args);
	}

}
