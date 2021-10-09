package com.java.hibernate.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MappingAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop laptop = new Laptop();
		laptop.setId(1);
		laptop.setLname("HP");
		
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Akhilesh");
		emp.setLaptop(laptop);
		
		laptop.setEmployee(emp);
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);		
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(emp);
		
		session.getTransaction().commit();;
		
	}

}
