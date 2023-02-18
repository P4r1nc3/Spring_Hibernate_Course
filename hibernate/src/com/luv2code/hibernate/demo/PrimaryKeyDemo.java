package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();
		
		try {
			// use the session object
			System.out.println("Creating a new student objects...");
			
			// create 3 students object 
			Student tempStudent1 = new Student("John", "Doe", "paulwall@example.com");
			Student tempStudent2 = new Student("Paul", "Walker", "paulwalker@example.com");
			Student tempStudent3 = new Student("John", "Deer", "johndeer@example.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save a students objects
			System.out.println("Saving a new student...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
		

	}

}
