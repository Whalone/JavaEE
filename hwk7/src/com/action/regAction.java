package com.action;


import com.opensymphony.xwork2.ActionSupport;

public class regAction extends ActionSupport{
	private String username;
	private String password1;
	private String password2;
	
	public String execute() throws Exception{
		
		return "success";
	}
	
	public void validate(){
		if(username==null||username.equals("")){
			addFieldError("username", "�������˺ţ� ");
		}
		if(password1==null||password1.equals("")){
			addFieldError("password1", "���������룡 ");
		}
		if(password1!=password2){
			addFieldError("password2", "������������벻һ�£����������룡");
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
