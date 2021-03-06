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

import com.kodem.demo.model.SkillModel;
import com.kodem.demo.model.UserModel;
import com.kodem.demo.repository.SkillRepository;
import com.kodem.demo.repository.UserRepository;
import com.kodem.demo.requestbody.SkillRequestBody;

/**
 * @author sanju
 *
 */
@RestController
public class SkillController {
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("createSkill")
	public void createSkill(@RequestBody SkillRequestBody skillRequestBody)
	{
		System.out.println(skillRequestBody);
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();

		SkillModel skill = new SkillModel(user, skillRequestBody.getTechnology(),skillRequestBody.getRating());
		skillRepository.save(skill);
	}
	
	@PutMapping("/skill/{skillId}")
	public void updateSkill(@RequestBody SkillRequestBody skillRequestBody,@PathVariable Integer skillId)
	{
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();
		SkillModel skill = new SkillModel(user, skillRequestBody.getTechnology(), skillRequestBody.getRating());
		skill.setSkillId(skillId);
		skillRepository.save(skill);
	}
	
	@GetMapping("/skill/{username}")
	public List<SkillModel> getAllSkill(@PathVariable String username)
	{
		List<SkillModel> skills = new ArrayList<>();
        skillRepository.findByUserUsername(username).forEach(skills::add);
        return skills;
	
	}
	
	@GetMapping("/skillById/{id}")
	public SkillModel getSkill(@PathVariable int id)
	{
        
        return skillRepository.findById(id).get();
	}
	
	@DeleteMapping("/skill/{skillId}")
	public void deleteSkill(@PathVariable Integer skillId)
	{
		skillRepository.deleteById(skillId);
	}

}
