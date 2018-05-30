<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>register</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">


  </head>
  
  <body>
    <s:form action="login" method="post" namespace="/">
      <a href="text.action?request_locale=en_US">English</a><br>
      <a href="text.action?request_locale=zh_CN">简体中文</a>
      <s:textfield name="username" key="username" size="15"/>
      <s:password name="password" key="password" size="15"/>
      <s:radio name="sex" key="sex" 
      		list="#{'1':'男','2':'女'}" value="'1'"/>
      <s:checkboxlist name="hobby" key="hobby"
      		 list="#{'a':'王者荣耀','b':'绝地求生','c':'阴阳师','d':'连连看'}" />
      <s:select name="course" key="course" list="#{'1':'PHP'}" value="'1'">
        <s:optgroup label="JavaEE" 
        	  list="#{'2':'Struts','3':'Hibernate','4':'Spring'}"/>
        <s:optgroup label="Web"
        	  list="#{'5':'Javascript','6':'BootStrap'}"/>
      </s:select> 
      <s:textarea name="text" key="text" row="3" cols="20"/>
      <s:submit key="loginbtn"/>
    </s:form>
    
  </body>
</html>
