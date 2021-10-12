package com.rocket.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocket.domain.User;
import com.rocket.repositories.UserRepository;

import javassist.tools.rmi.ObjectNotFoundException;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User findById (Integer id) throws ObjectNotFoundException {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
		//"object not find Id: " + id + ", Tipo: "+User.class.getName())); 				
	}
	
}
