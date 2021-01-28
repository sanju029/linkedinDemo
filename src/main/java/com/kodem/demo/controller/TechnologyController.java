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

import com.kodem.demo.model.TechnologyModel;
import com.kodem.demo.service.TechnologyService;

/**
 * @author sanju
 *
 */

@RestController
@RequestMapping("/technology")
public class TechnologyController
{
	
	@Autowired
	TechnologyService technologyService;
	
	@PostMapping
	public void createTechnology(@RequestBody TechnologyModel technology)
	{
		technologyService.createTechnology(technology);
	}
	
	@GetMapping("/{url}")
	public TechnologyModel getTechnology(@PathVariable String url)
	{
		return technologyService.getTechnology(url);
	}
	
	@DeleteMapping("/{url}")
	public void deleteTechnology(@PathVariable String url)
	{
		technologyService.deleteTechnology(url);
	}
	
	@PutMapping("/{url}")
	public void updateTechnology(@PathVariable String url, @RequestBody TechnologyModel technology)
	{
		technologyService.updateTechnology(technology, url);
	}
	
	@GetMapping
	public List<TechnologyModel> getAllTechnologies()
	{
		return technologyService.getAllTechnologies();
	}

	
}
