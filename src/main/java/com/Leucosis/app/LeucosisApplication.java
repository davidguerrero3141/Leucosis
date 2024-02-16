package com.Leucosis.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LeucosisApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeucosisApplication.class, args);
		
	}
	
//    @Bean
//    public CommandLineRunner demo(IRoleRepositoryDao roleRepo) {
//        return (args) -> {
//            Role role=new Role();
//            role.setName("ROLE_ADMIN");
//            roleRepo.save(role);
//        };
//    }

}
