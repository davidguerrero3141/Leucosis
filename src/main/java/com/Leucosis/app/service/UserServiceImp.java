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
	public User getUserById(Long idUser) {
		// TODO Auto-generated method stub
		return userDao.getUserById(idUser);
	}

	@Override
	public User addUser(User user) {
		
		return userDao.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) userDao.findAll();
	}

	@Override
	public User findByUsernameOrEmail(String Username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.existsByUserName(userName);
	}

	@Override
	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.existsByEmail(email);
	}

	@Override
	public User getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserName(userName);
	}

}
