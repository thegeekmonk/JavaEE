package com.hibernate;

import java.util.List;

import org.hibernate.Query;
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
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friend.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(rg);
		
		Session session = sf.openSession();		
		
        Query q = session.createQuery("from Friend where id = 5");
		
		Transaction tx = session.beginTransaction();	
		
		   Friend fr = (Friend)q.uniqueResult();		
	
			System.out.println(fr);
	
		
		tx.commit();
		

	}

}
