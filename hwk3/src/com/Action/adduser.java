package com.Action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class adduser extends ActionSupport{
	private String username;
	private String password;
	private String phone;
	private String birth;
	private String sex;
	ActionContext ac = ActionContext.getContext();
	
public void validate(){ 
		
		if("".equals(username.trim())||username==null){
			addFieldError("username", "对不起，用户姓名不能为空。");
		}
		if("".equals(username.trim())||username==null){
			addFieldError("password", "对不起，密码不能为空。");
		}
		
	}

	public String execute() throws Exception{
		ac.getApplication().put("username", username);
		ac.getApplication().put("password", password);
		ac.getApplication().put("phone", phone);
		ac.getApplication().put("birth", birth);
		ac.getApplication().put("sex", sex);
		
		
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}


	

	
	
}
