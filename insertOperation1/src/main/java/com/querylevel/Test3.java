package com.querylevel;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
	public static void main(String[] arg) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		System.out.println("first query...");
		Query query = session.createQuery("from Student3");
		query.setCacheable(true);
		List<Student3> students = query.list();
		for (Student3 student : students) {
			System.out.println("ID= " + student.getId());
			System.out.println("City= " + student.getCity());
			System.out.println("Mobile= " + student.getMobile());
			System.out.println("Name= " + student.getName());
		}
		session.close();
		sessionFactory.close();
		System.out.println("Record retrieved successfully...");

	}
}