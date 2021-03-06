package com.hibernate.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Application 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ServiceRegistry sr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata meta = new MetadataSources(sr).getMetadataBuilder().build();
		SessionFactory sf = meta.getSessionFactoryBuilder().build();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Friend fr = new Friend(); //new object
		fr.setId(103);
		fr.setAge(34);
		fr.setName("Hello");
		
		session.save(fr);
		t.commit();
		
		System.out.println("Record Added succesfully !!");
		
		session.close();

		//<mapping class = "com.hibernate.javatpoint.Friend"/> we have to add this mapping class property in cfg file
		
	}

}
