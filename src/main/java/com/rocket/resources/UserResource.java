package com.rocket.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocket.domain.User;
import com.rocket.services.UserService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) throws ObjectNotFoundException {
			User obj = this.service.findById(id);
			return ResponseEntity.ok().body(obj);
			
	}

}