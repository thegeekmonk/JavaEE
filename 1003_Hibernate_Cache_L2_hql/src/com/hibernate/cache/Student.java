package com.hibernate.cache;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "student")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Student 
{      
	   @Id
       private int roll;
       private String name;
       
       
	public int getRoll() 
	{
		return roll;
	}
	
	public void setRoll(int roll)
	{
		this.roll = roll;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	@Override
	public String toString() 
	{
		return "Student [roll=" + roll + ", name=" + name + "]";
	}       
       
}
