package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class StudentDao {
	public Student check(int sid){
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Student where sid=?");
		query.setParameter(0, sid);
		
		Student s = (Student) query.uniqueResult();
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		return s;
	}
}
