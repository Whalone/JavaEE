package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.models.Booking;



public class BookingDao {
	public void saveBooking(Booking booking) {
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(booking);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	public List showMsg(String username){
		Configuration config = new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Booking where userName=?");
			query.setParameter(0, username);
		List<Booking> list = query.list();
		transaction.commit();
		session.close();
		sessionFactory.close();
		return list;
		
	}
}
