package com.Leucosis.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Leucosis.app.dto.JwtTokenDto;
import com.Leucosis.app.dto.LoginDto;
import com.Leucosis.app.dto.SignUpDto;
import com.Leucosis.app.entity.User;
import com.Leucosis.app.enums.RoleEnum;
import com.Leucosis.app.exceptions.AttributeException;
import com.Leucosis.app.security.jwt.JwtProvider;

@Service
public class UserEntityService {

	@Autowired
	IUserService userService;
	
    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    AuthenticationManager authenticationManager;
    
    
    public User create(User user) throws AttributeException {
        if(userService.existsByEmail(user.getUserName()))
            throw new AttributeException("username already in use");
        if(userService.existsByEmail(user.getEmail()))
            throw new AttributeException("email already in use");
        return userService.addUser(mapUserFromDto(user));
    }

    public JwtTokenDto login(LoginDto dto) {
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtProvider.generateToken(authentication);
        return new JwtTokenDto(token);
    }


    // private methods
    private User mapUserFromDto(User user) {
        String password = passwordEncoder.encode(user.getPassword());
        List<RoleEnum> roles = user.getRoles();
        user.setPassword(password);
        user.setRoles(roles);
        return user;
    }
}
