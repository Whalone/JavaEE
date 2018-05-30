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
		Map session = invocation.getInvocationContext().getSession();//ͨ�������Ĳ�����ȡsession
		String username = (String) session.get("username");//��session����ȡusername ������û�е�½
		System.out.println("ִ����������");
		System.out.println(username);
		
		if(username!=null){  //����������ִ�� û�еĻ� ��ֱ��������½����
			return invocation.invoke();
		}else if(username==null){
			session.put("msg", "�㻹δ��½�����¼��");
			return Action.LOGIN;
		}
		return Action.LOGIN;
	}
	
}
