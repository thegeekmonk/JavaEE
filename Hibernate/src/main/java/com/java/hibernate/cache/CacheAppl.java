package com.java.hibernate.cache;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class CacheAppl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp;
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
		ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		
		SessionFactory sf = con.buildSessionFactory(rg);
		Session session = sf.openSession();
		
		
		session.beginTransaction();
		
//		emp = session.get(Employee.class, 101);		
//		System.out.println(emp);
		
		Query q1 = session.createQuery("from Employee where id=101");
		q1.setCacheable(true);
		emp = (Employee)q1.getSingleResult();
		System.out.println(emp);
		
		
//		emp = session.get(Employee.class, 101);
//		System.out.println(emp);
		
		session.getTransaction().commit();
		session.close();
		
			
		Session session2 = sf.openSession();
		session2.beginTransaction();	
		
		//emp = session2.get(Employee.class, 101);
				
		
		Query q2 = session2.createQuery("from Employee where id=101");
		q2.setCacheable(true);
		emp = (Employee)q2.getSingleResult();
		System.out.println(emp);
		

		session2.getTransaction().commit();
		session2.close();
	}

}
