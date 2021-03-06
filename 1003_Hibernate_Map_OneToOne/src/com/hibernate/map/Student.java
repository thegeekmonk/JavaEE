package com.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student 
{    
	 @Id
     private int roll;
     private String name;
     
     @OneToOne                //annotation used for deciding mapping relation with laptop
     private Laptop laptop;   //one of the field in student class 
     
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	
     
     
}
