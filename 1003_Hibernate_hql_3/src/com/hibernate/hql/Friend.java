package com.hibernate.hql;
import javax.persistence.*;


@Entity
@Table(name="friend")
public class Friend 
{   
	@Id
    private int id;
    private int age;
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
	
	
	@Override
	public String toString() {
		return "Friend [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
    
    
    
}
