package com.Action;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ControlAction extends ActionSupport{
	ActionContext ac = ActionContext.getContext();
	
	public String execute() throws Exception{
		String username=(String) ac.getApplication().get("username");
		String password=(String) ac.getApplication().get("password");
		System.out.println(username);
		System.out.println(password);
		return "success";
	}
}
