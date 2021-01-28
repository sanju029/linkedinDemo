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

import com.kodem.demo.model.CollegeModel;
import com.kodem.demo.service.CollegeService;

/**
 * @author sanju
 *
 */
@RestController
@RequestMapping("/college")
public class CollegeController
{
	@Autowired
	CollegeService collegeService;
	
	@PostMapping
	public void createCollege(@RequestBody CollegeModel college)
	{
		collegeService.createCollege(college);
	}
	
	@GetMapping("/{url}")
	public CollegeModel getCollege(@PathVariable String url)
	{
		return collegeService.getCollege(url);
	}
	
	@DeleteMapping("/{url}")
	public void deleteCollege(@PathVariable String url)
	{
		collegeService.deleteCollege(url);
	}
	
	@PutMapping("/{url}")
	public void updateCollege(@PathVariable String url, @RequestBody CollegeModel college)
	{
		collegeService.updateCollege(college, url);
	}
	
	@GetMapping
	public List<CollegeModel> getAllColleges()
	{
		return collegeService.getAllCollges();
	}
}
