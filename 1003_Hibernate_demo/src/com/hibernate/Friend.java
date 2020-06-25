package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Table;

@Entity(name="Dost")
//@Table(appliesTo = "Dost")

@Table(name="Dostiyari")
public class Friend 
{    
	 @Id
     private int id;
     private String name;
     private int age;
     
     
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
     
     
     
}
