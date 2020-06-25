package com.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class FriendName 
{
    private String Fname;
    private String Mname;
    private String Lname;
    
    
	public String getFname() 
	{
		return Fname;
	}
	public void setFname(String fname) 
	{
		Fname = fname;
	}
	public String getMname()
	{
		return Mname;
	}
	public void setMname(String mname)
	{
		Mname = mname;
	}
	public String getLname() 
	{
		return Lname;
	}
	public void setLname(String lname) 
	{
		Lname = lname;
	}
    
    
}
