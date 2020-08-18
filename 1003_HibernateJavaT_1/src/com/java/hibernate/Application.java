package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Application 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		
		Friend fr = new Friend();
		fr.setId(102);
		fr.setAge(27);
		fr.setName("August");
		
		session.save(fr);
		t.commit();
		
		System.out.println("Row added successfully");
		session.close();
		factory.close();
		
		
	}

}
