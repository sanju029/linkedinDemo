/**
 * 
 */
package com.kodem.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodem.demo.model.EducationModel;
import com.kodem.demo.model.UserModel;
import com.kodem.demo.repository.EducationRepository;
import com.kodem.demo.repository.UserRepository;
import com.kodem.demo.requestbody.EducationRequestBody;

/**
 * @author sanju
 *
 */
@RestController
public class EducationController
{
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("createEducation")
	public void createEducation(@RequestBody EducationRequestBody educationRequestBody)
	{
		UserModel user = userRepository.findByUsername(educationRequestBody.getUser()).get();
		EducationModel education = new EducationModel(user, educationRequestBody.getCollege(), educationRequestBody.getCourse(), educationRequestBody.getJoiningYear(), educationRequestBody.getEndingYear(), educationRequestBody.getGrade());
		educationRepository.save(education);
	}
	
	@PutMapping("education/{educationId}")
	public void updateEducation(@RequestBody EducationRequestBody educationRequestBody,@PathVariable Integer educationId)
	{
		UserModel user = userRepository.findByUsername(educationRequestBody.getUser()).get();
		EducationModel education = new EducationModel(user, educationRequestBody.getCollege(), educationRequestBody.getCourse(), educationRequestBody.getJoiningYear(), educationRequestBody.getEndingYear(), educationRequestBody.getGrade());
		education.setEducationId(educationId);
		educationRepository.save(education);
	}
	
	@GetMapping("education/{username}")
	public List<EducationModel> getAllExperience(@PathVariable String username)
	{
		return educationRepository.findByUserUsername(username);
	}
	
	@DeleteMapping("education/{educationId}")
	public void deleteEducation(@PathVariable Integer educationId)
	{
		educationRepository.deleteById(educationId);
	}
	
}
