package com.hibernate;

import org.hibernate.cfg.Configuration;

public class Application 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
	}

}
