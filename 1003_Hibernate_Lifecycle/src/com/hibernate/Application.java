package com.hibernate;

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
       
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();		
		
		Student st = new Student(); //Java Object in NEW state 
		st.setRoll(17);
		st.setName("Ramesh Kumar");
		
		//Hibernate Object 'st' is in Transient state
		
		
		Transaction tx = session.beginTransaction();
		
		session.save(st); //Hibernate Object 'st' is in Persistent state after save()		
		st.setName("Rameshba Kumar");   //Hibernate Object 'st' still in persistent state and name change will be reflected in DB		
		
		tx.commit();
		
		session.detach(st); //after detach(st) state of object 'st'changed to detached state , hence chages will not be reflected in DB
		st.setName("Ramesh Kumar"); //trying to change data , it will not be reflected in DB
		
		
	}

}
