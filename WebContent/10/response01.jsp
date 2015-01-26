 <%-- 

	FileName:response01.jsp
	desc: JSP内置对象Response对象示例程序1.
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
<title>response对象实例1</title>
</head>
<body>
<%   
//response.setHeader("Cache-Control", "no-cache");
out.println("date is " + new java.util.Date().toString() + "<br/>");
response.setIntHeader("Refresh", 2);
%>
</body>
</html>