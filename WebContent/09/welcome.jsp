 <%-- 

	FileName:welcome.jsp
	desc: 通过登陆示例程序演示JSP内置对象Request对象的使用.
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
<title>信息展示页面</title>
</head>
<body>
欢迎页面<br/>

用户名：<%= request.getAttribute("userName") %><br/>
特长：<%= request.getAttribute("skills") %><br/>
</body>
</html>