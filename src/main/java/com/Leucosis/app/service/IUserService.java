package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.User;

public interface IUserService {

	public User getUserById(Long idUser);
	public User addUser(User user);
	public User findByUsernameOrEmail(String Username);
	public List<User> getAllUser();
	
	public boolean existsByUserName(String userName);
	public boolean existsByEmail(String email);
	public User getUserByUserName(String userName);
}

