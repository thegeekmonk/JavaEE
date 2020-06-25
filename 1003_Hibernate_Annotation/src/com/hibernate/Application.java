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
		
		Friend fr = new Friend();
		fr.setId(102);
		fr.setAge(28);
		fr.setName("Satyasheel Kumar");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friend.class);		
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(rg);		
		Session session = sf.openSession();

		
		Transaction tx = session.beginTransaction();
		session.save(fr);
		
		tx.commit();		
		
	}

}
