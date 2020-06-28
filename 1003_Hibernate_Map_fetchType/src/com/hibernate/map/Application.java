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
		
//		Student st = new Student();
//		st.setRoll(10);
//		st.setName("Akhilesh Kumar");
//		
//		Laptop lap1 = new Laptop();
//		lap1.setLid(1);
//		lap1.setLname("Dell");
//		lap1.setStud(st);
//		
//		Laptop lap2 = new Laptop();
//		lap2.setLid(2);
//		lap2.setLname("HP");
//		lap2.setStud(st);
				
		
//		Student st2 = new Student();
//		st2.setRoll(11);
//		st2.setName("Satya Prasad");
				
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
//		
//		session.save(st);
//		
//		session.save(lap1);
//		session.save(lap2);
		
		Student stu = session.get(Student.class,10);
		
//		System.out.println(lap);
		
		
		tx.commit();
			
         
	}

}
