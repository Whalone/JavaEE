package com.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		// ��ʼ
		System.out.println("���ƿ�ʼ");
		// ִ�е�ǰĿ�귽��
		Object obj = proceedingJoinPoint.proceed();
		// ����
		System.out.println("���ƽ���");
		return obj;
	}

}
