package com.demo.moscickijenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MoscickijenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoscickijenkinsApplication.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello jenkins";
	}
}
