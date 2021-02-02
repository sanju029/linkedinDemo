/**
 * 
 */
package com.kodem.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.UserModel;

/**
 * @author sanju
 *
 */
public interface UserRepository extends JpaRepository<UserModel, Integer>
{
	public Optional<UserModel> findByUsername(String username);
}
