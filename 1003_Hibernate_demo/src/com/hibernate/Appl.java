package com.hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Appl 
{

	public static void main(String[] args) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException 
	{
		// TODO Auto-generated method stub
		
		Friend fr = new Friend();
		
		fr.setId(801);
		fr.setName("Balram Kumar");
		fr.setAge(32);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Friend.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		org.hibernate.Transaction tx = session.beginTransaction();
		session.save(fr);
		
		tx.commit();

	}

}
