package com.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	public String username;
	public String password;
	
	Map session = ActionContext.getContext().getSession();
	
	public String execute() throws Exception{
		
		String str="";
		if(username.equals("admin")&&password.equals("123")){
			session.put("username", username);
			session.put("password", password);
			
			return "success";
		}else if(username.length()>=4){
			
			int startIndex = username.indexOf('1');
			if(startIndex<0){
				startIndex=0;
			}	
			str = username.substring(startIndex,startIndex+4);
			if(str.equals("1==1")){
				session.put("msg","ÕËºÅº¬Ãô¸ÐÐÅÏ¢¡£");
				return Action.LOGIN;
			}
		}else if(username.equals("")||username==null){
			
			session.put("msg","ÕËºÅ²»ÄÜÎª¿Õ¡£");
			return Action.LOGIN;
			
		}else{
			
			session.put("msg","ÕËºÅÃÜÂë´íÎó¡£");
			return Action.LOGIN;
		}
		return Action.LOGIN;
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
	
}
