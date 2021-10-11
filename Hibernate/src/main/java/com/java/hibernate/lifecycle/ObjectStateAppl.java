package com.java.hibernate.lifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ObjectStateAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//transient state
		Employee emp = new Employee();
		emp.setEid(103);
		emp.setEname("Hello");
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		//persistance state
		session.save(emp);
		
		session.remove(emp);
		emp.setEname("People");
		
		session.getTransaction().commit();
	    
		session.detach(emp);
		emp.setEname("Detached State Object");
		
	}

}
