package com.action;

import com.dao.CustomerDao;
import com.opensymphony.xwork2.ActionSupport;

public class regAction extends ActionSupport{
	private String username;
	private String password1;
	private String password2;
	CustomerDao CD = new CustomerDao();
	
	public String execute() throws Exception{
		CD.saveCustomer(username, password1);
		return "success";
	}

	public void validate(){
		if(!password1.equals(password2)){
			addFieldError("password1", "������������벻һ�£�");
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
