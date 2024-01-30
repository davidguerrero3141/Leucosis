package com.Leucosis.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.Leucosis.app.entity.User;
import com.Leucosis.app.service.IUserService;


@CrossOrigin(origins= {"http://localhost:4200"}) //8082 // en dado caso seria el de angular
@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private IUserService userService;
	
	
	@PostMapping("/nuevo")
	@ResponseStatus(HttpStatus.CREATED)
	public void addUSer(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@GetMapping("/usuarios")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}
