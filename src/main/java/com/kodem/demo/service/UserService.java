/**
 * 
 */
package com.kodem.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodem.demo.model.UserModel;
import com.kodem.demo.repository.UserRepository;



/**
 * @author sanju
 *
 */

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepository;
	
	public void createUser(UserModel user)
	{
		userRepository.save(user);
	}
	
	public UserModel getUser(String username)
	{
		return userRepository.findByUsername(username).get();
	}
	
	public List<UserModel> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	public void updateUser(UserModel updatedUser, String username)
	{
		UserModel oldUser = userRepository.findByUsername(username).get();
		updatedUser.setUserId(oldUser.getUserId());
		userRepository.save(updatedUser);
	}
	
	public void deleteUser(String username)
	{
		UserModel user = userRepository.findByUsername(username).get();
		userRepository.delete(user);
	}
}
