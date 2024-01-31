package com.Leucosis.app.service;

import java.util.List;

import com.Leucosis.app.entity.User;

public interface IUserService {

	public User getUser(Long idUser);
	public void addUser(User user);
	public List<User> getAllUser();
}
