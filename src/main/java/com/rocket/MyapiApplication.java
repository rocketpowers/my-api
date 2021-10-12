package com.rocket;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rocket.domain.User;
import com.rocket.repositories.UserRepository;

@SpringBootApplication
public class MyapiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		User u1=new User(null, "rocky balboa", "rocky", "123");
		User u2=new User(null, "bibiano fernandes", "bibiano", "123");
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		
	}

}
