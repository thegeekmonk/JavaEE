package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dost")
public class Friend 
{   
	@Id
    private int id;
	
	
    private int age;
    private FriendName name;
        
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FriendName getName() {
		return name;
	}
	public void setName(FriendName name) {
		this.name = name;
	}
    
    
}
