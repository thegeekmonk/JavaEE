package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

//import org.hibernate.annotations.Table;

@Entity
@Table(name = "Dost")
public class Friend 
{    
	 @Id
     private int id;
     
     @Column(name="umar")
     private int age;
     
     @Transient
     private String name;
     
     
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
     
     
     
}
