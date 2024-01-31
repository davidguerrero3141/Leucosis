package com.Leucosis.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.Leucosis.app.dao.IRoleRepositoryDao;
import com.Leucosis.app.entity.Role;

@SpringBootApplication
public class LeucosisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeucosisApplication.class, args);
		
	}
	
    @Bean
    public CommandLineRunner demo(IRoleRepositoryDao roleRepo) {
        return (args) -> {
            Role role=new Role();
            role.setName("ROLE_ADMIN");
            roleRepo.save(role);
        };
    }

}
