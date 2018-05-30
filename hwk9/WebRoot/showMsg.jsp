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
	<table border="1">
		<tr bgcolor="#E7E7E7">
			<td height="24" colspan="6" >用户列表</td>
		</tr>
		<tr algin="center" bgcolor="#FAFAF1" height="22">
			<td width="15%">姓名</td>
			<td width="10%">性别</td>
			<td width="20%">始发城市</td>
			<td width="20%">目的城市</td>
			<td width="25%">出发日期</td>
			<td width="25%">身份证</td>
		</tr>
		<s:iterator value="#session.directorList" var="director">
			<tr>
				<td><s:property value="did"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="age"/></td>
				
			</tr>
		</s:iterator>
	</table>
  </body>
</html>
