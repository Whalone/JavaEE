package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.models.Booking;
import com.util.DatabaseConnection;

public class BookingDao {
	public Booking saveBooking(String username, String sex,String begCity,String endCity,String date,String id) {
		Connection conn = DatabaseConnection.getConnection();
		String sql = "INSERT INTO ticket(username,sex,begCity,endCity,date,id) VALUES ('" + username
				+ "','" +sex+"','"+ begCity + "','"+endCity+"','"+date+"','"+id+"')";
		try {
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List showMsg(String username){
		List ticketList = new ArrayList();
		Connection conn = DatabaseConnection.getConnection();
		String sql = "select * from ticket where userName='" + username
				+  "'";
		try {
			Statement stm = conn.createStatement();
			ResultSet set = stm.executeQuery(sql);
			while (set.next()) {
				Booking booking = new Booking();
				booking.setUsername(set.getString(1));
				booking.setSex(set.getString(2));
				booking.setBegCity(set.getString(3));
				booking.setEndCity(set.getString(4));
				booking.setDate(set.getString(5));
				booking.setId(set.getString(6));
				ticketList.add(booking);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ö´ÐÐ±£´æ£¡");
		return ticketList;
	}
}
