package com.hibernate.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student 
{    
	 @Id
     private int roll;
     private String name;
     
     @OneToMany           //not using @mappedBy annotation here since we don't want table laptop to know about relation with student
     private List<Laptop> laptop = new ArrayList<Laptop>();  //we have to instantiate laptop List variable

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

	public ArrayList<Laptop> getLaptop() 
	{
		return (ArrayList<Laptop>) laptop;
	}

	public void setLaptop(ArrayList<Laptop> laptop) 
	{
		this.laptop = laptop;
	}     
     
     
}
