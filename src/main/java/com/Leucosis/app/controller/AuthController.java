package com.Leucosis.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Leucosis.app.dto.JwtTokenDto;
import com.Leucosis.app.dto.LoginDto;
import com.Leucosis.app.dto.MessageDto;
import com.Leucosis.app.entity.User;
import com.Leucosis.app.exceptions.AttributeException;
import com.Leucosis.app.service.UserEntityService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    @Autowired
    UserEntityService userEntityService;

    @PostMapping("/create")
    public ResponseEntity<MessageDto> create(@Valid @RequestBody User userN) throws AttributeException {
        User user = userEntityService.create(userN);
        return ResponseEntity.ok(new MessageDto(HttpStatus.OK, "user " + user.getUserName() + " have been created"));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtTokenDto> login(@Valid @RequestParam String email, @RequestParam String contrasena) throws AttributeException {
        JwtTokenDto jwtTokenDto = userEntityService.login(email, contrasena);
        return ResponseEntity.ok(jwtTokenDto);
    }
}
