/**
 * 
 */
package com.kodem.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kodem.demo.model.EducationModel;

/**
 * @author sanju
 *
 */
public interface EducationRepository extends JpaRepository<EducationModel, Integer>
{
	public List<EducationModel> findByUserUsername(String username);
	
}
