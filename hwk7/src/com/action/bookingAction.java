package com.action;

import java.util.List;
import com.dao.BookingDao;
import com.models.Booking;
import com.opensymphony.xwork2.ActionSupport;



public class bookingAction extends ActionSupport{
	private Booking booking; //定义booking对象
	BookingDao BD = new BookingDao(); //实例化BookingDao对象
	private List<Booking> bookingList; //定义集合对象
 	
	public String execute() throws Exception{
 		BD.saveBooking(booking);
 		return "success";
 	}
 	
 	public String getBookings(){
 		bookingList = BD.getBookings();
 		return "list";
 	}
 	
 	public Booking getBooking(){
 		return booking;
 	}
 	
 	public void setBooking(Booking booking){
 		this.booking=booking;
 	}
 	
 	public List<Booking> getBookingList(){
 		return bookingList;
 	}
}
