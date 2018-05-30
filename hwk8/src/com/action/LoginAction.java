package com.action;

import java.util.Map;

import com.dao.CustomerDao;
import com.models.Customer;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javassist.expr.NewArray;

public class LoginAction extends ActionSupport{
	Customer customer;
	Customer customer2;
	
	CustomerDao CD = new CustomerDao();
	Map session = ActionContext.getContext().getSession();
	
	public String execute() throws Exception{
		String name = customer.getUsername();
		String password = customer.getPassword();
		
		customer2 = CD.checkLogin(name, password);
		if(customer2!=null){
			session.put("username", name);
			session.put("password", password);
			System.out.println("成功放了信息在session！");
			return "success";
		}else{
			
			addFieldError("customer.username", "账号或密码不正确！");
			return Action.LOGIN;
		}
		
		
	}
	
	


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	

	
	
	
}
