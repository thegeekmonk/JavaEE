package com.hibernate.map;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student 
{    
	 @Id
     private int roll;
     private String name;
     
     @ManyToMany
     private ArrayList<Laptop> laptop = new ArrayList<Laptop>();

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

	public ArrayList<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(ArrayList<Laptop> laptop) {
		this.laptop = laptop;
	}
     
     
     
}
