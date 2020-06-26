package com.hibernate.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="laptop")     //annotation used for table name 
public class Laptop 
{    
	 @Id                   //annotation used for primary key
     private int lid;
     private String name;
     
     
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
     
     
}
