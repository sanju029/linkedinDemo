/**
 * 
 */
package com.kodem.demo.requestbody;

/**
 * @author sanju
 *
 */
public class EducationRequestBody
{
	
	private String user;
	private String college;
	private String course;
	private String joiningYear;
	private String endingYear;
	private String grade;
	
	
	public EducationRequestBody(String user, String college, String course, String joiningYear, String endingYear,
			String grade) {
		super();
		this.user = user;
		this.college = college;
		this.course = course;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
		this.grade = grade;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
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
		return "EducationRequestBody [user=" + user + ", college=" + college + ", course=" + course + ", joiningYear="
				+ joiningYear + ", endingYear=" + endingYear + ", grade=" + grade + "]";
	}
	
	
	
	
}
