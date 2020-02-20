package com.first.microservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="second-microservice", fallback = FallbackImpl.class)
public interface FeignClientFirstMs {
	
	@GetMapping("/sayHi")
	public String hiFromSecondMs();

}
