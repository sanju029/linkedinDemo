/**
 * 
 */
package com.kodem.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.SkillModel;
import com.kodem.demo.model.UserModel;

/**
 * @author sanju
 *
 */
public interface SkillRepository extends JpaRepository<SkillModel, Integer>{
	
	public List<SkillModel> findByUserUsername(String username);
	
	

}
