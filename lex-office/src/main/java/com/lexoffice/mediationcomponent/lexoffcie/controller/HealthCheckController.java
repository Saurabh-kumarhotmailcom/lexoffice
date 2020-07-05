package com.lexoffice.mediationcomponent.lexoffcie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("/")
	public String health() {
		return "{health:true}";
	}
}
