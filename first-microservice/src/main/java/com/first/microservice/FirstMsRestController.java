package com.first.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstMsRestController {
	
	@Autowired
	private FeignClientFirstMs feignClientFirstMs;

	@GetMapping("/sayHi")
	public String hiFromSecondMs() {
		return feignClientFirstMs.hiFromSecondMs();
	}
}
