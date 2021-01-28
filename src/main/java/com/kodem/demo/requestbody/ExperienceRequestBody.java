/**
 * 
 */
package com.kodem.demo.requestbody;

/**
 * @author sanju
 *
 */
public class ExperienceRequestBody
{
	private String user;
	private String company;
	private String role;
	private String joiningYear;
	private String endingYear;
	
	
	public ExperienceRequestBody(String user, String company, String role, String joiningYear, String endingYear) {
		super();
		this.user = user;
		this.company = company;
		this.role = role;
		this.joiningYear = joiningYear;
		this.endingYear = endingYear;
	}


	public String getUser() {
		return user;
	}


	public void setUser(String user) {
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
		return "ExperienceRequestBody [user=" + user + ", company=" + company + ", role=" + role + ", joiningYear="
				+ joiningYear + ", endingYear=" + endingYear + "]";
	}
	
	
	
}
