package com.hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Appl 
{

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException 
	{
		// TODO Auto-generated method stub
		
		Friend fr = new Friend();
		
		fr.setId(711);
		fr.setName("Bablu Kumar");
		fr.setAge(47);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friend.class);
		
		ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(reg);
		
		Session session = sf.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();  //creating transaction object
		session.save(fr);
		
		tx.commit();                           //commit transaction

	}

}
