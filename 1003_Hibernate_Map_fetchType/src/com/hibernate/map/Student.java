package com.hibernate.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{   
	@Id
    private int roll;
    private String name;  
    
    @OneToMany(fetch=FetchType.LAZY,mappedBy="stud")
    private List<Laptop> laptop = new ArrayList<Laptop>();
    
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
	

	public Collection<Laptop> getLaptop() 
	{
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) 
	{
		this.laptop = laptop;
	}    
    
}
