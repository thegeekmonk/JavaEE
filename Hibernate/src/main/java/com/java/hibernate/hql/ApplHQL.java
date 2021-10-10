package com.java.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class ApplHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//Employee emp;
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		Query query = session.createQuery("select sum(eid) from Employee");
		
		//List<Object> employee = (List<Object>)query.list();
		
		Long lon = (Long)query.getSingleResult();
		
		
		System.out.println(lon);
		//System.out.println(employee);
		
//		for(Object obj : employee)
//		{
//			System.out.println(obj);
//		}
//		
		
		
		session.getTransaction().commit();
		
	}

}
