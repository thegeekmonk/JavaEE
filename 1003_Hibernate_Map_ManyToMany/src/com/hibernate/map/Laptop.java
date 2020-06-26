package com.hibernate.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="laptop")
public class Laptop 
{    
	 @Id
     private int lid;
     private String lname;
     
     @ManyToMany
     private List<Student> student = new ArrayList<Student>();

	public int getLid() 
	{
		return lid;
	}

	public void setLid(int lid) 
	{
		this.lid = lid;
	}

	public String getLname() 
	{
		return lname;
	}

	public void setLname(String lname) 
	{
		this.lname = lname;
	}

	public ArrayList<Student> getStudent() 
	{
		return (ArrayList<Student>) student;
	}

	public void setStudent(ArrayList<Student> student) 
	{
		this.student = student;
	}
     
     
     
}
