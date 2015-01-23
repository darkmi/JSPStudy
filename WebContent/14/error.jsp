<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆异常提示页面</title>
</head>
<body>
登陆失败.<br/>
用户名：<%= request.getParameter("uname") %><br/>
密码：<%= request.getParameter("upwd") %><br/>

<a href="login.jsp">返回登陆页面</a>
</body>
</html>