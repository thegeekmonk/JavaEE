package com.java.hibernate.annotation;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeName {

	private String eFname;
	private String eMname;
	private String eLname;
	public String geteFname() {
		return eFname;
	}
	public void seteFname(String eFname) {
		this.eFname = eFname;
	}
	public String geteMname() {
		return eMname;
	}
	public void seteMname(String eMname) {
		this.eMname = eMname;
	}
	public String geteLname() {
		return eLname;
	}
	public void seteLname(String eLname) {
		this.eLname = eLname;
	}
	@Override
	public String toString() {
		return "EmployeeName [eFname=" + eFname + ", eMname=" + eMname + ", eLname=" + eLname + "]";
	}
	
	
	
}
