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
public class TechnologyModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer technologyId;
	private String technologyName;
	@Column(unique = true)
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TechnologyModel(Integer technologyId, String technologyName) {
		super();
		this.technologyId = technologyId;
		this.technologyName = technologyName;
	}

	public TechnologyModel(Integer technologyId, String technologyName, String url) {
		super();
		this.technologyId = technologyId;
		this.technologyName = technologyName;
		this.url = url;
	}

	public Integer getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(Integer technologyId) {
		this.technologyId = technologyId;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}

	@Override
	public String toString() {
		return "TechnologyModel [technologyId=" + technologyId + ", technologyName=" + technologyName + ", url=" + url
				+ "]";
	}
	
	
	
	
}
