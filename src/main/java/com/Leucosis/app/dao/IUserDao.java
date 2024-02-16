package com.Leucosis.app.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Leucosis.app.entity.User;

import org.springframework.stereotype.Repository;


@Repository
public interface IUserDao extends JpaRepository<User, Long>{

	@Query("select u from User u where u.userName = ?1 or u.email = ?1")
	public Optional<User> findByUsernameOrEmail(String username);
	
	@Query("Select u from User u where u.idUser = ?1")
	public User getUserById(Long id);

	@Query("select exists(select u from User u where u.userName = ?1)")
	public boolean existsByUserName(String username);

	@Query("select exists(select u from User u where u.email = ?1)")
	public boolean existsByEmail(String email);
	
	@Query("select u from User u where u.userName = ?1")
	public User getUserByUserName(String userName);
	
}
