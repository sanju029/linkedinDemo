/**
 * 
 */
package com.kodem.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.ExperienceModel;
import com.kodem.demo.model.UserModel;

/**
 * @author sanju
 *
 */
public interface ExperienceRepository extends JpaRepository<ExperienceModel, Integer>
{
	public List<ExperienceModel> findByUserUsername(String username);
	
}
