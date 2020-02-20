package com.first.microservice;

import org.springframework.stereotype.Component;

@Component
public class FallbackImpl implements FeignClientFirstMs{

	@Override
	public String hiFromSecondMs() {
		return "Hi from hystrix";
	}

	
}
