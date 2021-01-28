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

import com.kodem.demo.model.SkillModel;
import com.kodem.demo.model.TechnologyModel;
import com.kodem.demo.model.UserModel;
import com.kodem.demo.repository.SkillRepository;
import com.kodem.demo.repository.TechnologyRepository;
import com.kodem.demo.repository.UserRepository;
import com.kodem.demo.requestbody.SkillRequestBody;

/**
 * @author sanju
 *
 */
public class SkillController {
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private TechnologyRepository technologyRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping
	public void createSkill(@RequestBody SkillRequestBody skillRequestBody)
	{
		TechnologyModel college = technologyRepository.findByUrl(skillRequestBody.getTechnology()).get();
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();
		SkillModel skill = new SkillModel(user, college);
		skillRepository.save(skill);
	}
	
	@PutMapping("/{skillId}")
	public void updateSkill(@RequestBody SkillRequestBody skillRequestBody,@PathVariable Integer skillId)
	{
		TechnologyModel college = technologyRepository.findByUrl(skillRequestBody.getTechnology()).get();
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();
		SkillModel skill = new SkillModel(user, college);
		skill.setSkillId(skillId);
		skillRepository.save(skill);
	}
	
	@GetMapping("/{username}")
	public List<SkillModel> getAllSkill(@PathParam("user") String username)
	{
		return skillRepository.findByUserUsername(username);
	}
	
	@DeleteMapping("/{skillId}")
	public void deleteSkill(@PathVariable Integer skillId)
	{
		skillRepository.deleteById(skillId);
	}

}
