package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Application 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf = con.buildSessionFactory(rg);
        Session session1 = sf.openSession();
        
        Student s1 = session1.get(Student.class,10);
        System.out.println(s1);
        session1.beginTransaction().commit(); //committing transaction
        session1.close();
        
        
        Session session2 = sf.openSession();
        Student s2 = session2.get(Student.class,10);
        System.out.println(s2);
        
        session2.beginTransaction().commit();
        session2.close();
        
	}

}
