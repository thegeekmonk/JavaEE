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
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);		
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
//		    Student st = new Student();
//		    st.setRoll(15);
//		    st.setName("Vivek Kumar");
		
		Transaction tx = session.beginTransaction();
		
		Student stu = session.get(Student.class,10);
//		System.out.println(stu);
//		System.out.println(stu.getName());
		
		
	
		Student st = session.load(Student.class,17);   //also  called 'st' here as proxy object returned by load
//		System.out.println(st);       //since we are using 'st' object in printing, hence select query is getting fired
		
		tx.commit();

	}

}
