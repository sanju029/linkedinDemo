/**
 * 
 */
package com.kodem.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodem.demo.model.CollegeModel;
import com.kodem.demo.repository.CollegeRepository;

/**
 * @author sanju
 *
 */

@Service
public class CollegeService
{
	@Autowired
	private CollegeRepository collegeRepository;
	
	public void createCollege(CollegeModel college)
	{
		collegeRepository.save(college);
	}
	
	public CollegeModel getCollege(String url)
	{
		return collegeRepository.findByUrl(url).get();
	}
	
	public List<CollegeModel> getAllCollges()
	{
		return collegeRepository.findAll();
	}
	
	public void updateCollege(CollegeModel updatedCollege, String url)
	{
		CollegeModel oldCollege = collegeRepository.findByUrl(url).get();
		updatedCollege.setCollegeId(oldCollege.getCollegeId());
		collegeRepository.save(updatedCollege);
	}
	
	public void deleteCollege(String url)
	{
		CollegeModel college = collegeRepository.findByUrl(url).get();
		collegeRepository.delete(college);
	}
}
