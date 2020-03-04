package com.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResousce {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@email.com", "999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
