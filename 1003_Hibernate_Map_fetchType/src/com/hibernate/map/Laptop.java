package com.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop 
{   
	@Id
    private int lid;
    private String lname;
    
    @ManyToOne(fetch=FetchType.LAZY)
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

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", stud=" + stud + "]";
	}
    
    
    
}
