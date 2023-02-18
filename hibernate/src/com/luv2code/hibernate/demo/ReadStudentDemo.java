package com.luv2code.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

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
			System.out.println("Creating a new student object...");
			
			// create student object 
			Student tempStudent = new Student("Daffy", "Duck", "daffyduck@example.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save a student object 
			System.out.println("Saving a new student...");
			session.save(tempStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			// student's id
			System.out.println("Saved student. Generated id: " + tempStudent.getId());
			
			// new session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			// retrieve student based on the id
			System.out.println("\nGetting student with id: " + tempStudent.getId());
			
			Student myStudent = session.get(Student.class , tempStudent.getId());
			
			System.out.println("Get complete: " + myStudent);
			
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
