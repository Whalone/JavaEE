package com.interceptor;

import java.util.Map;

import org.apache.struts2.components.Else;

import com.action.UserAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptorLogOut extends AbstractInterceptor{
	
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("��־���أ����˵�½��");
		return invocation.invoke();
		// TODO Auto-generated method stub
		
		
	}

}
