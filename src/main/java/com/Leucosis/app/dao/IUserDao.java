package com.Leucosis.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Leucosis.app.entity.User;




import org.springframework.stereotype.Repository;


@Repository
public interface IUserDao extends JpaRepository<User, Long>{

	@Query("select u from User u where u.userName = ?1 or u.email = ?2")
	public User findByUsernameOrEmail(String username, String email);
	
	@Query("Select u from User u where u.idUser = ?1")
	public User getUserById(Long id);

	@Query("select exists(select u from User u where u.userName = ?1)")
	boolean existsByUserName(String username);

	@Query("select exists(select u from User u where u.email = ?1)")
	boolean existsByEmail(String email);
}
