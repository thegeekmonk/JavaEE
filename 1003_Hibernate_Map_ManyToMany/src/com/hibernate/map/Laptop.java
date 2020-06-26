package com.hibernate.map;

import java.util.ArrayList;

import javax.persistence.*;


@Entity
@Table(name="laptop")
public class Laptop 
{
     private int lid;
     private String lname;
     
     @ManyToMany()
     private ArrayList<Student> student = new ArrayList<Student>();

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}
     
     
     
}
