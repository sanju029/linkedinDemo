/**
 * 
 */
package com.kodem.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.TechnologyModel;

/**
 * @author sanju
 *
 */
public interface TechnologyRepository extends JpaRepository<TechnologyModel, Integer> {
	
	public Optional<TechnologyModel> findByUrl(String url);
}
