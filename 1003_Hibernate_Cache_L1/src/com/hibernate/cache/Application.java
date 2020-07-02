package com.hibernate.cache;

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
		
		Student st = null;
//		st.setRoll(10);
//		st.setName("Akhilesh Kumar");
				
		st = session.get(Student.class,10);
		
		Transaction tx = session.beginTransaction();		
		System.out.println(st);
		tx.commit();
		session.close();
		
		Session session2 = sf.openSession();
		Transaction tx1 = session2.beginTransaction();
		
		
		st = session2.get(Student.class,10);
		System.out.println(st);		
		tx1.commit();
		session2.close();
	}

}
