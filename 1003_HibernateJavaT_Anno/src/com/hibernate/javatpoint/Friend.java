package com.hibernate.javatpoint;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Friend")
public class Friend 
{    
	 @Id
     private int id;
     private int age;
     private String name;
     
     
     
     
}
