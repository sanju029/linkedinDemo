/**
 * 
 */
package com.kodem.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.CollegeModel;

/**
 * @author sanju
 *
 */
public interface CollegeRepository extends JpaRepository<CollegeModel, Integer> {
	
	public Optional<CollegeModel> findByUrl(String url);

}
