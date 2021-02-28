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
public class ExperienceModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer experienceId;
	@Column(nullable = false)
	private String company;
	private String role;
	private String joiningYear;
	private String endingYear;
	
	
	
	public ExperienceModel() {
		super();
	}



	public ExperienceModel(Integer experienceId, UserModel user, String company, String role, String joiningYear,
			String endingYear) {
		super();
		this.experienceId = experienceId;
		this.user = user;
		this.company = company;
		this.role = role;
		

		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
	}
	
	

	public ExperienceModel(UserModel user, String company, String role, String joiningYear, String endingYear) {
		super();
		this.user = user;
		this.company = company;
		this.role = role;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
	}



	public Integer getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(Integer experienceId) {
		this.experienceId = experienceId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}

	public String getEndingYear() {
		return endingYear;
	}

	public void setEndingYear(String endingYear) {
		this.endingYear = endingYear;
	}

	@Override
	public String toString() {
		return "ExperienceModel [experienceId=" + experienceId + ", user=" + user + ", company=" + company + ", role="
				+ role + ", joiningYear=" + joiningYear + ", endingYear=" + endingYear + "]";
	}
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="user_user_id",nullable=false)
	@JsonBackReference
	private UserModel user;
	
	
	
	
	
	
}
