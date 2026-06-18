package com.itb.sistema.sgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SgtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgtApplication.class, args);
		System.out.println("Server start port 8880");
		System.out.println("Tomcat Server");
	}

}
