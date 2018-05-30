package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class PrivilegeInterceptor extends AbstractInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map session = invocation.getInvocationContext().getSession();
		String username = (String) session.get("username");
		System.out.println("µÚÒ»¸öÀ¹½Ø£º");
		System.out.println(username);
		if(username!=null){
			return invocation.invoke();
		}else{
			session.put("msg", "Äú»¹Î´µÇÂ¼£¬ÇëÏÈµÇÂ¼¡£");
			return Action.LOGIN;
		}
	}
	
}
