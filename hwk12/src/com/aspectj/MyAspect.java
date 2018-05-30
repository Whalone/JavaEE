package com.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint)
			throws Throwable {
		// 开始
		System.out.println("环绕开始");
		// 执行当前目标方法
		Object obj = proceedingJoinPoint.proceed();
		// 结束
		System.out.println("环绕结束");
		return obj;
	}

}
