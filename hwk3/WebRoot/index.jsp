<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <s:form action="adduser" method="post" namespace="/add">
      <s:textfield name="username" label="用户名" size="15"/>
      <s:password name="password" label="密码" size="15"/>
      <s:textfield name="phone" label="电话" size="15"/>
      <s:textfield name="birth" label="生日" size="15"/>
      <s:textfield name="sex" label="性别" size="15"/>
      <s:submit value="添加用户 " align="center"/>
    </s:form>
  </body>
</html>
