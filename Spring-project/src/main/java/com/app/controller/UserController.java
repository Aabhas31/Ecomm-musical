package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.User;
import com.app.repo.UserRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserController {

@Autowired
private UserRepository userrepository;

@GetMapping("/user")
public List<User>getAllEmployees()
{
 return userrepository.findAll();	
}

@PostMapping("/user")
public User createEmployee(@RequestBody User user)
{
	return userrepository.save(user);
}
}
