package com.Leucosis.app.service;

import java.security.Principal;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.Leucosis.app.dao.IUserDao;




@Service
public class UserDetail implements UserDetailsService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = (User) userDao.findByUsernameOrEmail(username, username);
	        if(user==null){
	            throw new UsernameNotFoundException("User not exists by Username");
	        }
	           
	        Set<GrantedAuthority> authorities = ((Collection<GrantedAuthority>) user.getRoles()).stream()
	                .map((role) -> new SimpleGrantedAuthority(((Principal) role).getName()))
	                .collect(Collectors.toSet());
	        return new org.springframework.security.core.userdetails.User(username,user.getPassword(),authorities);
	}

}
