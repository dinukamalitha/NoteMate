package com.notemate.notemate_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotemateBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotemateBackendApplication.class, args);
		System.out.println("Server started");
	}

}
