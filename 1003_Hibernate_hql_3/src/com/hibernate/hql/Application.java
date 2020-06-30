package com.hibernate.hql;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
		
		//Native Query , Using SQL Query in Hibernate
		SQLQuery query = session.createSQLQuery("select id,name from friend where age = 27");
//		query.addEntity(Friend.class);
		
		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		List friends = query.list();
		
//		System.out.println(friends);
		
		for(Object fr : friends)
		{
			Map mp = (Map)fr;			
			System.out.println(mp.get("id")+"  "+mp.get("name"));
			
		}
		
		
		tx.commit();
		
	}

}
