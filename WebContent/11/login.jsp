<%-- 

	FileName:login.jsp
	desc: JSP的session对象示例2：登陆页面.
	Author:darkmi
	Date:2014/12/30
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session示例程序2：登陆页面</title>
</head>
<body>
	<form action="do_login.jsp" method="post">
		userName：<input type="text" name="uname" /><br /> 
		uPwd：<input type="password" name="upwd" /><br /> 
		<input type="submit" value="Login" /> 
		<input type="reset" value="Reset" />
	</form>
</body>
</html>