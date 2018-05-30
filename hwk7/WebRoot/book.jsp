<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>机票预定</title>

  </head>
  
  <body>
    <center>
    	<h2>在线机票预订</h2>
    	<s:form action="book" method="post" namespace="/">
	    	<s:textfield name="booking.username" label="姓名" size="18"/>
	    	<s:radio list="#{'男':'男','女':'女'}" label="性别" value="'男'" name="booking.sex"/>
	    	<s:textfield name="booking.begCity" label="始发城市" size="18"/>
	    	<s:textfield name="booking.endCity" label="目的城市" size="18"/>
	    	<s:textfield name="booking.date" label="出发日期" size="18"/>
	    	<s:textfield name="booking.id" label="身份证" size="18"/>
	    	<s:submit value="预定"/>
    	</s:form>
    </center>
  </body>
</html>
