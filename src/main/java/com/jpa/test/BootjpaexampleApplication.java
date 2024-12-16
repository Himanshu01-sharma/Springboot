package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.user;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository jp=context.getBean(UserRepository.class);
		user user = new user();
		
			
		user.setName("js");
		user.setCity("ma");
		user.setStatus("java");
		user kk = jp.save(user);
		System.out.println(kk);
	}

}
