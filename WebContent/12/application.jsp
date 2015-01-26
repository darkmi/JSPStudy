<%-- 

	FileName:application.jsp
	desc: JSP的application对象示例.
	Author:darkmi
	Date:2014/12/31
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application对象示例</title>
</head>
<body>
<%= application.getServerInfo() %><br/>
<%= application.getServletContextName() %><br/>
<%= application.getVirtualServerName() %><br/>
</body>
</html>