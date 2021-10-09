package com.java.hibernate.annotation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int id;
	
	private EmployeeName ename;
	private String branch;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EmployeeName getEname() {
		return ename;
	}
	public void setEname(EmployeeName ename) {
		this.ename = ename;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", branch=" + branch + "]";
	}
	
	
	
}
