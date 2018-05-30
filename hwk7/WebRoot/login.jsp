<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户登陆</title>
  </head>
  
  <body>
    <center>
    	<h2>用户登陆</h2>
    	<s:form name="login" method="post" >
    		<s:textfield name="username" label="账号" size="18"/>
    		<s:password name="password" label="密码" size="18"/>
    		<s:submit value="登陆"/>
    	</s:form>
    	<br><s:a href="register.jsp">注册新用户</s:a>
    </center>
  </body>
</html>
