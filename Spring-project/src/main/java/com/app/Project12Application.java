package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.pojos.User;
import com.app.repo.UserRepository;

@SpringBootApplication
public class Project12Application {

	public static void main(String[] args) {
		SpringApplication.run(Project12Application.class, args);
	}

}
