package com.hibernate.hql;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name="friend")
public class Friend 
{   
	@Id
    private int id;
    private String name;
    private int age;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
    
    
    
}
