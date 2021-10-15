package com.rocket.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rocket.domain.User;
import com.rocket.repositories.UserRepository;
import com.rocket.services.exceptions.ObjectNotFoundException;

//import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public User findById(Integer id) throws ObjectNotFoundException  {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + User.class.getName()));
	}
	

	public List<User> findAll() {
		return repository.findAll();
		
		
	}

}
	

