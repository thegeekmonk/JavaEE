package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Appl 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Friend fr = new Friend();
		
		fr.setId(1001);
		fr.setName("Balram Kumar");
		fr.setAge(32);
		
		
		Configuration con = new Configuration();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.save(fr);

	}

}
