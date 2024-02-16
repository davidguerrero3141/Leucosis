package com.Leucosis.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//import com.Leucosis.app.dao.IRoleRepositoryDao;
import com.Leucosis.app.dao.IUserDao;
import com.Leucosis.app.dto.LoginDto;
import com.Leucosis.app.entity.User;
import com.Leucosis.app.service.IUserService;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


//@CrossOrigin(origins = { "http://localhost:4200" }) // 8082 // en dado caso seria el de angular
@RestController
public class UserController {

	@Autowired
	private IUserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private IUserDao userDao;

//	@Autowired
//	private IRoleRepositoryDao roleRepositoryDao;

	@Autowired
	private PasswordEncoder passwordEncoder;


	@GetMapping("/list")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@GetMapping("/getuser/{id}")
	public User getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}

	@GetMapping("/login")
	public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return new ResponseEntity<>("User login successfully!...", HttpStatus.OK);
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody User user) {

		if (userDao.existsByUserName(user.getUserName())) {
			return new ResponseEntity<>("Username is already exist!", HttpStatus.BAD_REQUEST);
		}

		if (userDao.existsByEmail(user.getEmail())) {
			return new ResponseEntity<>("Email is already exist!", HttpStatus.BAD_REQUEST);
		}

		user.setPassword(passwordEncoder.encode(user.getPassword()));
		//Role roles = roleRepositoryDao.findByName("ROLE_CUSTOMER").get();
		//user.setRoles(Collections.singleton(roles));
		userDao.save(user);
		return new ResponseEntity<>("User is registered successfully!", HttpStatus.OK);
	}
}
