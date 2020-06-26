package com.hibernate.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Laptop lap = new Laptop();
		lap.setLid(11);
		lap.setName("Dell");
		
		Student stu = new Student();
		stu.setRoll(101);
		stu.setName("Akhilesh Kumar");
		stu.setLaptop(lap);           //setting laptop field in student class
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf =  con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(stu);
		session.save(lap);
		
		tx.commit();
		

	}

}
