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
public class EducationModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer educationId;
	
//	@ManyToOne
//	private UserModel user;
	
	@Column(nullable = false)
	private String college;
	private String course;
	private String joiningYear;
	private String endingYear;
	private String grade;
	
	
	
	
	
	public EducationModel() {
		super();
	}



	public EducationModel(Integer educationId, UserModel user, String college, String course, String joiningYear,
			String endingYear, String grade) {
		super();
		this.educationId = educationId;
		this.user = user;
		this.college = college;
		this.course = course;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
		this.grade = grade;
	}
	
	
	
	public EducationModel(UserModel user, String college, String course, String joiningYear, String endingYear,
			String grade) {
		super();
		this.user = user;
		this.college = college;
		this.course = course;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
		this.grade = grade;
	}



	public Integer getEducationId() {
		return educationId;
	}
	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "EducationModel [educationId=" + educationId + ", user=" + user + ", college=" + college + ", course="
				+ course + ", joiningYear=" + joiningYear + ", endingYear=" + endingYear + ", grade=" + grade + "]";
	}
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="user_user_id",nullable=false)
	@JsonBackReference
	private UserModel user;
	
	
}
