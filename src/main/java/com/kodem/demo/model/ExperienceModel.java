package com.kodem.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ExperienceModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer experienceId;
	@ManyToOne
	private UserModel user;
	@ManyToOne
	private CompanyModel company;
	private String role;
	private String joiningYear;
	private String endingYear;
	
	public ExperienceModel(Integer experienceId, UserModel user, CompanyModel company, String role, String joiningYear,
			String endingYear) {
		super();
		this.experienceId = experienceId;
		this.user = user;
		this.company = company;
		this.role = role;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
	}
	
	

	public ExperienceModel(UserModel user, CompanyModel company, String role, String joiningYear, String endingYear) {
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

	public CompanyModel getCompany() {
		return company;
	}

	public void setCompany(CompanyModel company) {
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
	
	
	
	
	
}
