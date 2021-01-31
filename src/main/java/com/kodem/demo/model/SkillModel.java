package com.kodem.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SkillModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer skillId;
	@ManyToOne
	private UserModel user;
	@Column(nullable = false)
	private String technology;
	
	
	
	
	public SkillModel() {
		super();
	}



	public SkillModel(Integer skillId, UserModel user, String technology) {
		super();
		this.skillId = skillId;
		this.user = user;
		this.technology = technology;
	}

	
	
	public SkillModel(UserModel user, String technology) {
		super();
		this.user = user;
		this.technology = technology;
	}



	public Integer getSkillId() {
		return skillId;
	}

	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "SkillModel [skillId=" + skillId + ", user=" + user + ", technology=" + technology + "]";
	}
	
	
	
	
}
