package com.hibernate.hql;

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
		Transaction tx = session.beginTransaction();
		
		int var = 8;
		
//		Query q = session.createQuery("select id,name from Friend f where f.id:var");
//		q.setParameter("var",var);
//		Object[] friend = (Object[])q.uniqueResult();
		
		Query q = session.createQuery("select sum(age) from Friend where id > 15");
		Long add = (Long)q.uniqueResult();
		
		
		System.out.println(add);
		
//		List<Object[]> friend = (List<Object[]>)q.list();
//		
//		
//		
//		for(Object[] fr : friend)
//		{
//			System.out.println(fr[0]+" : "+fr[1]);
//		}
//		
//		System.out.println(friend[0]+" : "+friend[1]);
		
		
		tx.commit();
	}

}
