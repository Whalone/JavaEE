package com.action;

import java.util.List;
import com.dao.BookingDao;
import com.models.Booking;
import com.opensymphony.xwork2.ActionSupport;



public class bookingAction extends ActionSupport{
	private Booking booking; //����booking����
	BookingDao BD = new BookingDao(); //ʵ����BookingDao����
	private List<Booking> bookingList; //���弯�϶���
 	
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
