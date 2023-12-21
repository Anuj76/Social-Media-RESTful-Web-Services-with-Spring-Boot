package com.in28min.rest.webservices.restfullwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	private UserDaoServices services;
	
	public UserResource(UserDaoServices services) {
		this.services = services;
	}
	
	@GetMapping("/users")
	public List<User> retriveAll(){
		return services.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id){
		User user = services.findOne(id);
		if(user==null) throw new UserNotFoundException("id:"+id);
		return user;
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id){
		services.deleteOne(id);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User saved = services.addUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
					   .path("/{id}")
					   .buildAndExpand(saved.getId()).toUri();
		return ResponseEntity.created(location).build();
	} 
	
	
	
	
	
}
