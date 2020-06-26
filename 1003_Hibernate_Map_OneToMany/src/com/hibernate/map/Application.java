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
		lap1.setName("Dell");
		
		Laptop lap2 = new Laptop();
		lap2.setLid(2);
		lap2.setName("HP");
		
		
		Student st = new Student();
		st.setRoll(101);
		st.setName("AKhilesh Kumar");
		st.getLaptop().add(lap1);
		st.getLaptop().add(lap2);	
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
        
		Transaction tx = session.beginTransaction();
		
		session.save(lap1);
		session.save(lap2);
		
		session.save(st);
		
		tx.commit();
		
	}

}
