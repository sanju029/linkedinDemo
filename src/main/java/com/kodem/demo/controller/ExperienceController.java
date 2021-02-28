/**
 * 
 */
package com.kodem.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodem.demo.model.ExperienceModel;
import com.kodem.demo.model.UserModel;
import com.kodem.demo.repository.ExperienceRepository;
import com.kodem.demo.repository.UserRepository;
import com.kodem.demo.requestbody.ExperienceRequestBody;

/**
 * @author sanju
 *
 */
@RestController
public class ExperienceController
{
	@Autowired
	private ExperienceRepository experienceRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("createExperience")
	public void createExperience(@RequestBody ExperienceRequestBody experienceRequestBody)
	{
		UserModel user = userRepository.findByUsername(experienceRequestBody.getUser()).get();
		ExperienceModel experience = new ExperienceModel(user, experienceRequestBody.getCompany(), experienceRequestBody.getRole(), experienceRequestBody.getJoiningYear(), experienceRequestBody.getEndingYear());
		experienceRepository.save(experience);
	}
	
	@PutMapping("/experience/{experienceId}")
	public void updateExperience(@RequestBody ExperienceRequestBody experienceRequestBody,@PathVariable Integer experienceId)
	{
		UserModel user = userRepository.findByUsername(experienceRequestBody.getUser()).get();
		ExperienceModel experience = new ExperienceModel(user, experienceRequestBody.getCompany(), experienceRequestBody.getRole(), experienceRequestBody.getJoiningYear(), experienceRequestBody.getEndingYear());
		experience.setExperienceId(experienceId);
		experienceRepository.save(experience);
	}
	
	@GetMapping("/experience/{username}")
	public List<ExperienceModel> getAllExperience(@PathVariable String username)
	{
		List<ExperienceModel> experiences = new ArrayList<>();
        experienceRepository.findByUserUsername(username).forEach(experiences::add);
        return experiences;
	}
	
	@GetMapping("/experienceById/{id}")
	public ExperienceModel getExperience(@PathVariable int id)
	{
        
        return experienceRepository.findById(id).get();
	}
	
	@DeleteMapping("/experience/{experienceId}")
	public void deleteExperience(@PathVariable Integer experienceId)
	{
		experienceRepository.deleteById(experienceId);
	}

}
