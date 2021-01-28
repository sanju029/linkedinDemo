/**
 * 
 */
package com.kodem.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodem.demo.model.UserModel;
import com.kodem.demo.service.UserService;

/**
 * @author sanju
 *
 */
@RestController
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void createUser(@RequestBody UserModel user)
	{
		userService.createUser(user);
	}
	
	@GetMapping("/{username}")
	public UserModel getUser(@PathVariable String username)
	{
		return userService.getUser(username);
	}
	
	@DeleteMapping("/{username}")
	public void deleteUser(@PathVariable String username)
	{
		userService.deleteUser(username);
	}
	
	@PutMapping("/{username}")
	public void updateUser(@PathVariable String username, @RequestBody UserModel user)
	{
		userService.updateUser(user, username);
	}
	
	@GetMapping
	public List<UserModel> getAllUsers()
	{
		return userService.getAllUsers();
	}
}
