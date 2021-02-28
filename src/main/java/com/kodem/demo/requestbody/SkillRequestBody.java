/**
 * 
 */
package com.kodem.demo.requestbody;

/**
 * @author sanju
 *
 */
public class SkillRequestBody
{
	private String user;
	public SkillRequestBody() {
		super();
	}

	private String technology;
	private String rating;
	
	public SkillRequestBody(String user, String technology, String rating) {
		super();
		this.user = user;
		this.technology = technology;
		this.rating = rating;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public SkillRequestBody(String user, String technology) {
		super();
		this.user = user;
		this.technology = technology;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
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
		return "SkillRequestBody [user=" + user + ", technology=" + technology + ", rating=" + rating +"]";
	}
	
	
	
}
