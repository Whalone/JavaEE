package com.Action;



import com.opensymphony.xwork2.ActionSupport;

import antlr.collections.List;


public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private String hobby;
	
	
	public String execute() throws Exception{
		return "success";
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	

	
}
