package com.action;

import java.util.List;

import com.dao.BookingDao;
import com.models.Booking;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BookingAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Booking booking;
	BookingDao BD = new BookingDao();
	
	public String execute() throws Exception {
		BD.saveBooking(booking);
		List ticketList = BD.showMsg(booking.getUsername());
		ActionContext.getContext().getSession().put("ticketList", ticketList);
		return "success";
	}

	
	
	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
}
