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
}
