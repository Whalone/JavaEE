package com.interceptor;

import java.util.Map;

import org.apache.struts2.components.Else;

import com.action.UserAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptorLogOut extends AbstractInterceptor{
	
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("日志拦截：有人登陆！");
		return invocation.invoke();
		// TODO Auto-generated method stub
		
		
	}

}
