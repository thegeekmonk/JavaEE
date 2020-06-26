package com.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="laptop")
public class Laptop 
{   
	@Id
    private int lid;
    private String lname;
    
    @ManyToOne
    private Student stud;
    
    
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
    
    
    
}
