<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'book.jsp' starting page</title>
    
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
    <center>
    	<h2>在线机票预订</h2>
    	<s:form action="book" method="post" namespace="/">
	    	<s:textfield name="booking.username" label="姓名" size="18"/>
	    	<s:radio name="booking.sex" list="#{'男':'男','女':'女'}" label="性别" value="'男'" />
	    	<s:textfield name="booking.begCity" label="始发城市" size="18"/>
	    	<s:textfield name="booking.endCity" label="目的城市" size="18"/>
	    	<s:textfield name="booking.date" label="出发日期" size="18"/>
	    	<s:textfield name="booking.id" label="身份证" size="18"/>
	    	<s:submit value="预定"/>
    	</s:form>
    </center>
  </body>
</html>
