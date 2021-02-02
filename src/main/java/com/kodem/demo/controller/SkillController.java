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
@RequestMapping("/skill")
public class SkillController {
	
	@Autowired
	private SkillRepository skillRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("createSkill")
	public void createSkill(@RequestBody SkillRequestBody skillRequestBody)
	{
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();
		SkillModel skill = new SkillModel(user, skillRequestBody.getTechnology());
		skillRepository.save(skill);
	}
	
	@PutMapping("/{skillId}")
	public void updateSkill(@RequestBody SkillRequestBody skillRequestBody,@PathVariable Integer skillId)
	{
		UserModel user = userRepository.findByUsername(skillRequestBody.getUser()).get();
		SkillModel skill = new SkillModel(user, skillRequestBody.getTechnology());
		skill.setSkillId(skillId);
		skillRepository.save(skill);
	}
	
	@GetMapping("/{username}")
	public List<SkillModel> getAllSkill(@PathVariable String username)
	{
		System.out.println(username);
		System.out.println(skillRepository.findAll());
		return skillRepository.findByUserUsername(username);
	}
	
	@DeleteMapping("/{skillId}")
	public void deleteSkill(@PathVariable Integer skillId)
	{
		skillRepository.deleteById(skillId);
	}

}
