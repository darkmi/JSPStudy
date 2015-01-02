<%-- 

	FileName:config.jsp
	desc: JSP的config对象示例.
	Author:darkmi
	Date:2015/01/02
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>config对象示例</title>
</head>
<body>

姓名：<%= config.getInitParameter("username") %><br/>
密码：<%= config.getInitParameter("password") %><br/>

</body>
</html>