<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>用户注册</title>
  </head>
  
  <body>
    <center>
      <h2>用户注册</h2>
      <s:form action="regAction" method="post" namespace="/">
	    <s:textfield name="username" label="账号" size="15"/>
	    <s:password name="password1" label="密码" size="15"/>
	    <s:password name="password2" label="密码" size="15"/>
	    <s:submit value="注册"/>
      </s:form>
    </center>
  </body>
</html>
