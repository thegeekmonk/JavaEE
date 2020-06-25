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
		
		FriendName fn = new FriendName();
		fn.setFname("Akhilesh");
		fn.setMname("Kumar");
		fn.setLname("Modi");
		
		Friend fr = new Friend();
		fr.setId(401);
		fr.setAge(30);
		fr.setName(fn);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friend.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(fr);
		
		tx.commit();

	}

}
