package com.kodem.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class SkillModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer skillId;
//	@ManyToOne
//	private UserModel user;
	@Column(nullable = false)
	private String technology;
	private String rating;
	
	
	
	
	public SkillModel(UserModel user,String technology, String rating) {
		super();
		this.technology = technology;
		this.rating = rating;
		this.user = user;
	}



	public SkillModel() {
		super();
	}



	public SkillModel(Integer skillId, UserModel user, String technology,String rating) {
		super();
		this.skillId = skillId;
		this.user = user;
		this.technology = technology;
		this.rating=rating;
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
	
	

	public String getRating() {
		return rating;
	}



	public void setRating(String rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "SkillModel [skillId=" + skillId + ", technology=" + technology + ", rating=" + rating + ", user=" + user
				+ "]";
	}
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="user_user_id",nullable=false)
	@JsonBackReference
	private UserModel user;
	
	
	
}
