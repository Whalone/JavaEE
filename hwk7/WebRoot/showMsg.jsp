<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>预定信息</title>
    
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
	<table>
		<tr bgcolor="#E7E7E7">
			<td height="24" colspan="6" >用户列表</td>
		</tr>
		<tr algin="center" bgcolor="#FAFAF1" height="22">
			<td width="15%">姓名</td>
			<td width="10%">性别</td>
			<td width="20%">始发城市</td>
			<td width="20%">目的城市</td>
			<td width="25%">出发日期</td>
			<td width="35%">身份证</td>
		</tr>
		<s:iterator value="bookingList" var="booking">
			<tr>
				<td><s:property value="#booking.username"/></td>
				<td><s:property value="#booking.sex"/></td>
				<td><s:property value="#booking.begCity"/></td>
				<td><s:property value="#booking.endCity"/></td>
				<td><s:property value="#booking.date"/></td>
				<td><s:property value="#booking.id"/></td>
			</tr>
		</s:iterator>
	</table>
  </body>
</html>
