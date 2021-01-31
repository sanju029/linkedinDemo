/**
 * 
 */
package com.kodem.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.kodem.demo.model.UserModel;
import com.kodem.demo.service.UserService;

/**
 * @author sanju
 *
 */
@RestController
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping("createUser")
	public void createUser(@RequestBody UserModel user)
	{
		userService.createUser(user);
	}
	
	@GetMapping("user/{username}")
	public UserModel getUser(@PathVariable String username)
	{
		System.out.println(username);
		return userService.getUser(username);
	}
	
	@DeleteMapping("user/{username}")
	public void deleteUser(@PathVariable String username)
	{
		userService.deleteUser(username);
	}
	
	@PutMapping("user/{username}")
	public void updateUser(@PathVariable String username, @RequestBody UserModel user)
	{
		userService.updateUser(user, username);
	}
	
	@GetMapping("users")
	public List<UserModel> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("user/")
	public ResponseEntity<String> hello(UriComponentsBuilder uriComponentsBuilder){
		UriComponents uriComponents = uriComponentsBuilder.path("sanju").build();
		URI uri = uriComponents.toUri();
        return ResponseEntity.created(uri).build();
	}

}
