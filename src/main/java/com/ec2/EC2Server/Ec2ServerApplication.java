package com.ec2.EC2Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ec2ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ec2ServerApplication.class, args);
	}
	
	

}
