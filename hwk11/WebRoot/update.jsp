<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    
    <title>My JSP 'update.jsp' starting page</title>
    
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
    <h2>请填写相应的信息选课：</h2>
    <s:form action="choose" method="post" namespace="/">
    	<s:textfield name="student.name" label="学生姓名"/>
    	<s:textfield name="student.age" label="学生年龄"/>
    	<s:textfield name="course.name" label="课程名字"/>
    	<s:submit value="确定"/>
    </s:form>
  </body>
</html>
