package com.example.springTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@RestController
	public class HelloController {
		@GetMapping("/api/hello")
		public String hello() {
			return "Hello from Spring Boot!";
		}
	}


}
