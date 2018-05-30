<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style type="text/css">
		#main{
			border:1px solid red;
			text-align:center;
			font-family:微软雅黑;
			padding-top:5px;
			margin-top:8px;
		}
	</style>

  </head>
  
  <body>
    <div id="main">
    	<s:property value="#session.msg"></s:property>
	    <form action="login" name="denglu" method="post" text-align="center">
		    <s:textfield name="username" label="账      号" size="15"/><br>
		    <s:password name="password" label="密      码" size="15"/><br>
		    <s:submit value="登陆" align="center"></s:submit>
	    </form>
    </div>
  </body>
</html>
