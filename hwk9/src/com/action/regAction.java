package com.action;

import com.dao.CustomerDao;
import com.models.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class regAction extends ActionSupport{
	private String username;
	private String password1;
	private String password2;
	Customer customer =new Customer();
	CustomerDao CD = new CustomerDao();
	
	public String execute() throws Exception{
		System.out.println(username);
		customer.setUsername(username);
		customer.setPassword(password1);
		CD.saveCustomer(customer);
		return "success";
	}
	

	public void validate(){
		if(!password1.equals(password2)){
			addFieldError("password1", "两次输入的密码不一致！");
		}
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	
	
}
