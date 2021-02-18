package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com")
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SpringApplication.run(CustomerMain.class, args);
         System.out.println("spring boot started.......");
	}
}
