package com.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.models.Customer;

public class CustomerDao {
	
	public void saveCustomer(Customer customer){
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	public Customer checkLogin(String username,String password){
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		System.out.println("执行到dao");
		Query query = session.createQuery("from Customer where userName=?"+"and password=?");
			System.out.println("执行完query");
			query.setParameter(0, username);
			query.setParameter(1, password);
			System.out.println("执行完查询");
		Customer c = (Customer) query.uniqueResult();
		System.out.println("执行完赋值c");
		transaction.commit();
		session.close();
		sessionFactory.close();
		return c;
	}
}
