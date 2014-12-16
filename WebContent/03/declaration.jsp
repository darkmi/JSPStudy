<%-- 

FileName:declaration.jsp
desc: JSP声明示例程序.
Author:darkmi
Date:2014/12/16
Copyright:www.jikexueyuan.com
MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello world</title>
</head>
<body>
	<!-- 这是一段html注释，你可以在客户端浏览器通过查看源码的形式看到我。 -->
	<%-- 这是一段JSP注释，你在客户端浏览器看不到我。--%>

	<%= (new java.util.Date()).toString() %>

	<%
	//以下是java中的单行注释
	//String str = "hello jikexueyuan";
	
    //以下是java中的多行注释
	/*
	out.println(str);
    out.println(str);
    */
    
%>
</body>
</html>