package com.rs.cdpapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="com.rs.h2happ")

public class CdpappApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdpappApplication.class, args);
	}

}
