package com.aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.dao.UserDao;


public class Test {
	public void demo1(){
		String xmlPath = "com/aspectj/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				xmlPath);
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		
		userDao.add();
	}
	
}
