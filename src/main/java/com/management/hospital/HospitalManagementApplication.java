package com.management.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/*
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
*/

@SpringBootApplication
@EnableScheduling
public class HospitalManagementApplication {

	public static void main(String[] args) {
		//seer
		SpringApplication.run(HospitalManagementApplication.class, args);
		//seer
	}

}
