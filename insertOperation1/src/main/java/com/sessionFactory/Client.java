package com.sessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Student1 s1 = (Student1) session.load(Student1.class, 3);
		System.out.println("First student data is =");
		System.out.println("Name =" + s1.getName());
		System.out.println("City =" + s1.getCity());
		System.out.println("Moblie =" + s1.getMobile());

		System.out.println("second level cache");
		Session session1 = sessionFactory.openSession();
		Student1 s2 = (Student1) session1.load(Student1.class, 3);
		System.out.println(" student data is =");
		System.out.println("Name =" + s1.getName());
		System.out.println("City =" + s1.getCity());
		System.out.println("Moblie =" + s1.getMobile());

	}
}
