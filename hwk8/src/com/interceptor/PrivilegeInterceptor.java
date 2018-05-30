package com.interceptor;

import java.util.Map;

import org.apache.struts2.components.Else;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map session = invocation.getInvocationContext().getSession();//通过他给的参数获取session
		String username = (String) session.get("username");//从session里面取username 看他有没有登陆
		System.out.println("执行拦截器！");
		System.out.println(username);
		
		if(username!=null){  //如果有则继续执行 没有的话 就直接跳到登陆界面
			return invocation.invoke();
		}else if(username==null){
			session.put("msg", "你还未登陆，请登录！");
			return Action.LOGIN;
		}
		return Action.LOGIN;
	}
	
}
