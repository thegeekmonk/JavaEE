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

		Laptop lap1 = new Laptop();
		lap1.setLid(1);
		lap1.setLname("Dell");
		
		Laptop lap2 = new Laptop();
		lap2.setLid(2);
		lap2.setLname("HP");
		
		Student st1 = new Student();
		st1.setRoll(101);
		st1.setName("Akhiles Kumar");
		
		Student st2 = new Student();
		st2.setRoll(102);
		st2.setName("Satya Prasad");
		
		lap1.getStudent().add(st1);
		lap1.getStudent().add(st2);
		
		lap2.getStudent().add(st1);
		lap2.getStudent().add(st2);
		
		
		st1.getLaptop().add(lap1);
		st1.getLaptop().add(lap2);
		
		st2.getLaptop().add(lap1);
		st2.getLaptop().add(lap2);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(lap1);
		session.save(lap2);
		
		session.save(st1);
		session.save(st2);
		
		tx.commit();
	}

}
