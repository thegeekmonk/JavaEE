package com.java.hibernate.config.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="student")
public class Student {
    
	@Id
	private int rollno;
	private String name;
	//@Transient
	
	private String branch;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString()
	{
		return "Id : "+rollno+", Name : "+name+", Branch :"+branch;
	}
	
}
