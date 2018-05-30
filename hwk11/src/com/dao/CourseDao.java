package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Student;

import cn.itcast.domain.User;

public class CourseDao {
	public void addCourse(Student student,Course course){
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		student.getCourses().add(course);
		course.getStudents().add(student);
		
		
		
		session.save(student);
		transaction.commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session.beginTransaction();
		
		Student student2 = (Student) session2.get(Student.class, 1);//¶þ¼¶»º´æ
		sessionFactory.close();
	}
}
