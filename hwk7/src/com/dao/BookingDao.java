package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.models.Booking;
import com.mxl.common.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.List;


public class BookingDao {
	//�����Ʊ��Ϣ����
	public int saveBooking(Booking booking){
		int num = 0;//��¼�Ƿ񱣴�ɹ�
		Session session = null;//����Session�ӿڶ���
		Transaction transaction=null;//����Transaction�ӿڶ���
		try {
			session = HibernateSessionFactory.getSession();//��ȡSession����
			transaction = session.beginTransaction();//��������
			num=Integer.parseInt(session.save(booking).toString());//��������
			transaction.commit();//�ύ����
		} catch (Exception e) {
			num=0;
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();//�ر�Session
		}
		return num;
	}
	
	public List<Booking> getBookings(){
		List<Booking> bookings = new ArrayList<Booking>();//ʵ�������϶���
		Session session = null;//����Session�ӿڶ���
		try{
			session = HibernateSessionFactory.getSession();//���Session����
			bookings=session.createQuery("from Booking").list();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			HibernateSessionFactory.closeSession();
		}
		return bookings;
	}
}
