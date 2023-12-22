package com.ec2.EC2Server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	
	@GetMapping("/sayHello")
	public String sayHello(){
		return "Hello Sandesh";
	}

}
