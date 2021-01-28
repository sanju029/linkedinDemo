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
public class CompanyModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer companyId;
	private String companyName;
	@Column(unique = true)
	private String url;
	private Integer companyRating;
	public CompanyModel(Integer companyId, String companyName, String url, Integer companyRating) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.url = url;
		this.companyRating = companyRating;
	}
	
	
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getCompanyRating() {
		return companyRating;
	}
	public void setCompanyRating(Integer companyRating) {
		this.companyRating = companyRating;
	}


	@Override
	public String toString() {
		return "CompanyModel [companyId=" + companyId + ", companyName=" + companyName + ", url=" + url
				+ ", companyRating=" + companyRating + "]";
	}
	
	
	
}
