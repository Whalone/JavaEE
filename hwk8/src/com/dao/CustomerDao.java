package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.models.Booking;
import com.models.Customer;
import com.util.DatabaseConnection;

public class CustomerDao {
	public Customer checkLogin(String userName, String password){
		System.out.println("执行了CD！");
		Connection conn = DatabaseConnection.getConnection();//连接数据库 得到一个connection
		String sql = "select * from t_user where userName='" + userName
				+ "' and password= '" + password + "'";
		try {
			Statement stm = conn.createStatement(); //得到一个statement connection —— statement
			ResultSet set = stm.executeQuery(sql);
			while (set.next()) {
				String userName1 = set.getString("userName");
				String password1 = set.getString("password");
				Customer customer = new Customer();
				customer.setUsername(userName1);
				customer.setPassword(password1);

				System.out.println("成功查询到！");
				return customer;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("查不到！");
		return null;
	}
	
	public Customer saveCustomer(String userName, String password){
		Connection conn = DatabaseConnection.getConnection();
		String sql = "INSERT INTO t_user(userName,password) VALUES ('" + userName
				+ "','" +password+"')";
		try {
			Statement stm = conn.createStatement();
			stm.executeUpdate(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
