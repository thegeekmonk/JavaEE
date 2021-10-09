package com.java.hibernate.config.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student st = new Student();
        st.setRollno(103);
        st.setName("Abhishek");
        st.setBranch("CSE");
        
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        
        ServiceRegistry rg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(rg);	
        
		System.out.println( "Hello World!" );
		
        Session session = sf.openSession();    
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        //Student stu = session.load(Student.class, 102);
        
       // System.out.println(stu);       
        
        tx.commit();  
        
        session.flush();
        session.close();
        sf.close();
    }
}
