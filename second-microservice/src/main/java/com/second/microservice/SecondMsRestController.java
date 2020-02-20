package com.second.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondMsRestController {
	
	@GetMapping("/sayHi")
	public String hiFromSecondMs() {
		return "Hi, From Second Microservice";
	}

}
