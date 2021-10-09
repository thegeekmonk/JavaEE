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
		
		Laptop lap = new Laptop();
		lap.setId(2);
		lap.setLname("DELL");
		
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("Akhilesh");
		emp.getLaptop().add(laptop);
		emp.getLaptop().add(lap);
		
		Employee employee = new Employee();
		employee.setEid(102);
		employee.setEname("Amit");
		employee.getLaptop().add(laptop);
		employee.getLaptop().add(lap);
		
		laptop.getEmployee().add(employee);
		laptop.getEmployee().add(emp);
	    lap.getEmployee().add(emp);	
	    lap.getEmployee().add(employee);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);		
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		session.save(laptop);
		session.save(lap);
		session.save(emp);
		session.save(employee);
		
		session.getTransaction().commit();		
	}

}
