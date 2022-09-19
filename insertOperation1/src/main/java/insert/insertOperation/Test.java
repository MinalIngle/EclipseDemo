package insert.insertOperation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String []args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session= sessionFactory.openSession();
	Transaction t=	session.beginTransaction();
	
	//insert data into database
			
//	Student student=new Student();
//	student.setName("ramesh");
//	student.setCity("nagpur");
//	student.setMobile("979898767");
//	session.save(student);
//	Student student1=new Student();
//	student1.setName("om");
//	student1.setCity("pune");
//	student1.setMobile("979898767");
//	session.save(student1);
//	t.commit();
//	session.close();
	
	//update data
	//pass the class name and id for updating record
	
//	Student student=(Student)session.get(Student.class,1);
//	student.setName("Sairam");
//	session.update(student);
//	session.getTransaction().commit();
//	session.close();
//	sessionFactory.close();
	
	//delete data
	
//	Student student=(Student)session.get(Student.class,1);
//	session.delete(student);
//	t.commit();
//	session.close();
//	sessionFactory.close();
	
	//pass the class name for retrive all the data....
	
	Query query=session.createQuery("from Student");
	List<Student>students=query.list();
	for(Student student : students) {
		System.out.println("ID="+student.getId());
		System.out.println("name="+student.getName());
		System.out.println("city="+student.getCity());
		System.out.println("Mobile="+student.getMobile());
	}
	session.close();
     sessionFactory.close();
	
	System.out.println("Record saved successfully...");
}
}
