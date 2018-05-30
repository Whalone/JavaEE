package com.action;

import java.util.List;
import java.util.Map;

import com.dao.StudentDao;
import com.model.Student;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class checkAction extends ActionSupport{
	String sid;
	StudentDao SD = new StudentDao();
	Map session = ActionContext.getContext().getSession();
	
	public String execute() throws Exception{
		System.out.println(sid);
		Student s = SD.check(Integer.parseInt(sid));
		
		if(s!=null){
			String name = s.getName();
			
			session.put("name", name);
			return "success";
		}
		addFieldError("sid", "查无此人！");
		return "input";
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}

	
	
	
}
