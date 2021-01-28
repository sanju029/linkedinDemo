/**
 * 
 */
package com.kodem.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodem.demo.model.TechnologyModel;
import com.kodem.demo.repository.TechnologyRepository;

/**
 * @author sanju
 *
 */
@Service
public class TechnologyService {

	@Autowired
	private TechnologyRepository technologyRepository;
	
	public void createTechnology(TechnologyModel technology)
	{
		technologyRepository.save(technology);
	}
	
	public TechnologyModel getTechnology(String url)
	{
		return technologyRepository.findByUrl(url).get();
	}
	
	public List<TechnologyModel> getAllTechnologies()
	{
		return technologyRepository.findAll();
	}
	
	public void updateTechnology(TechnologyModel updatedTechnology, String url)
	{
		TechnologyModel oldTechnology = technologyRepository.findByUrl(url).get();
		updatedTechnology.setTechnologyId(oldTechnology.getTechnologyId());
		technologyRepository.save(updatedTechnology);
	}
	
	public void deleteTechnology(String url)
	{
		TechnologyModel company = technologyRepository.findByUrl(url).get();
		technologyRepository.delete(company);
	}
}
