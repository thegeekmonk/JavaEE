package com.hibernate.hql;

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
		
		Query q = session.createQuery("select id,name from Friend");
		
		List<Object[]> friend = (List<Object[]>)q.list();
		
		Transaction tx = session.beginTransaction();
		
		for(Object[] fr : friend)
		{
			System.out.println(fr[0]+" : "+fr[1]);
		}
		
		
		tx.commit();
	}

}
