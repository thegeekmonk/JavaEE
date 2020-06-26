package com.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="taptop")
public class Laptop 
{   
	@Id
    private int lid;
    private String name;    
    
    
	public int getLid() 
	{
		return lid;
	}
	public void setLid(int lid) 
	{
		this.lid = lid;
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
