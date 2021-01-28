/**
 * 
 */
package com.kodem.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodem.demo.model.CompanyModel;

/**
 * @author sanju
 *
 */
public interface CompanyRepository extends JpaRepository<CompanyModel, Integer>
{
	public Optional<CompanyModel> findByUrl(String url);
}
