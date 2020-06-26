package com.hibernate.map;

import java.util.ArrayList;

import javax.persistence.OneToMany;
import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student 
{    
	 @Id
     private int roll;
     private String name;
     
     @OneToMany
     private  ArrayList<Laptop> laptop;

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
		return laptop;
	}

	public void setLaptop(ArrayList<Laptop> laptop) 
	{
		this.laptop = laptop;
	}     
     
     
}
