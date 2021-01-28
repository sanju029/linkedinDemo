/**
 * 
 */
package com.kodem.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author sanju
 *
 */

@Entity
public class CollegeModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer collegeId;
	private String collegeName;
	@Column(unique = true)
	private String url;
	private Integer collegeRating;
	
	
	
	public CollegeModel(Integer collegeId, String collegeName, String url, Integer collegeRating) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.url = url;
		this.collegeRating = collegeRating;
	}
	
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getCollegeRating() {
		return collegeRating;
	}
	public void setCollegeRating(Integer collegeRating) {
		this.collegeRating = collegeRating;
	}
	
	@Override
	public String toString() {
		return "CollegeModel [collegeId=" + collegeId + ", collegeName=" + collegeName + ", url=" + url
				+ ", collegeRating=" + collegeRating + "]";
	}
	
	
}
