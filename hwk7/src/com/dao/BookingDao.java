package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.models.Booking;
import com.mxl.common.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.List;


public class BookingDao {
	//保存机票信息方法
	public int saveBooking(Booking booking){
		int num = 0;//记录是否保存成功
		Session session = null;//声明Session接口对象
		Transaction transaction=null;//声明Transaction接口对象
		try {
			session = HibernateSessionFactory.getSession();//获取Session对象
			transaction = session.beginTransaction();//开启事务
			num=Integer.parseInt(session.save(booking).toString());//保存数据
			transaction.commit();//提交事务
		} catch (Exception e) {
			num=0;
			e.printStackTrace();
		}finally{
			HibernateSessionFactory.closeSession();//关闭Session
		}
		return num;
	}
	
	public List<Booking> getBookings(){
		List<Booking> bookings = new ArrayList<Booking>();//实例化集合对象
		Session session = null;//声明Session接口对象
		try{
			session = HibernateSessionFactory.getSession();//获得Session对象
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
