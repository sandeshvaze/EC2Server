package com.ec2.EC2Server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/sayHello")
	public String sayHello(){
		return "Hello Sandesh";
	}

}
