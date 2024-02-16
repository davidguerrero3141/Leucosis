package com.Leucosis.app.service;


import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.Leucosis.app.dao.IUserDao;
import com.Leucosis.app.entity.Role;
import com.Leucosis.app.entity.User;
import com.Leucosis.app.security.service.UserPrincipal;





@Service
public class UserDetail implements UserDetailsService {

	@Autowired
	private IUserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userEntity = (Optional<User>) userDao.findByUsernameOrEmail(username);
        if(!userEntity.isPresent())
            return null;
        return UserPrincipal.build(userEntity.get());
	}
	
	private Collection<? extends GrantedAuthority>
    mapRolesToAuthorities(Collection<Role> roles) {

return roles.stream()
      .map(role -> new SimpleGrantedAuthority
            (role.getName()))
      .collect(Collectors.toList());
}


}
