package com.infy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	@Value("${configserver}")
	private String propValue;
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
		System.out.println("config client started");
	}

	@GetMapping("/get-config")
	public String config() {
		return propValue;
	}
}
