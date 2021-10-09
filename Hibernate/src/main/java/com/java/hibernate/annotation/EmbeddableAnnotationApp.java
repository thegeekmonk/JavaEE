package com.java.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class EmbeddableAnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeName ename = new EmployeeName();
		ename.seteFname("Akhilesh");
		ename.seteMname("Kumar");
		ename.seteLname("Modi");
		
		Employee emp = new Employee();		
		emp.setId(101);
		emp.setBranch("CSE");
		emp.setEname(ename);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(emp);
		
		tx.commit();
		
		session.flush();
		session.close();
		sf.close();		
	}

}
