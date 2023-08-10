package de.schellner.azuretest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureTestApplication {

	@GetMapping("/hw")
	public String helloWorld() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzureTestApplication.class, args);
	}

}
