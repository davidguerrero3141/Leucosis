package com.Leucosis.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.Leucosis.app.security.jwt.JwtEntryPoint;
import com.Leucosis.app.security.jwt.JwtFilter;


@Configuration
public class WebSecurityConfiguration  {

    @Autowired
    JwtEntryPoint jwtEntryPoint;

    @Autowired
    JwtFilter jwtFilter;
	
    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        
    	http
        .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/auth/**").permitAll()
                .anyRequest().authenticated()
                
        )
        .csrf(csrf -> csrf.disable())
        .cors(cors -> cors.disable())
        .httpBasic(basic -> basic.authenticationEntryPoint(jwtEntryPoint))
        .sessionManagement((session) -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            );
    
    	http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    	
        
 

http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

return http.build();
    }
}
