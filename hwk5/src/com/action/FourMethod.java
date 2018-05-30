package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class FourMethod extends ActionSupport{
	public MessageStore ms;
	public String execute(){
		return "success";
	}
	public String add(){
		ms = new MessageStore();
		ms.setMessage("add");
	
		return "success";
	}
	public String del(){
		ms = new MessageStore();
		ms.setMessage("del");
		return "success";
	}
	public String update(){
		ms = new MessageStore();
		ms.setMessage("update");
		return "success";
	}
	public String search(){
		ms = new MessageStore();
		ms.setMessage("search");
		return "success";
	}
}
