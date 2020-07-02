package com.hibernate.cache;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

import org.hibernate.annotations.Cache;  
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="student")
@Cacheable    //it will make Student class to use cache
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)   //caching will work only for read operation
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
