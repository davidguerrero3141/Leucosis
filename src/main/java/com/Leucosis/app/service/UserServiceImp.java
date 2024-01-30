package com.Leucosis.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dao.IUserDao;
import com.Leucosis.app.entity.User;

@Service
public class UserServiceImp implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User getUser(int idUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		
		userDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

}
