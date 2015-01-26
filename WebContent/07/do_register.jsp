 <%-- 

	FileName:do_register.jsp
	desc: 动作指令useBean示例程序.
	Author:darkmi
	Date:2014/12/16
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@page import="com.jikexueyuan.entity.UserEntity"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册处理页面</title>
</head>
<jsp:useBean id="userEntity" scope="page" class="com.jikexueyuan.entity.UserEntity"/>

<jsp:setProperty property="*" name="userEntity"/>
<body>
<%
	String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    
    UserEntity user = new UserEntity();
    user.setUserName(userName);
    user.setPassword(password);
    
	out.println("userName ==> " + user.getUserName());
	out.println("<br/>");
	out.println("password ==> " + user.getPassword());
	out.println("<br/>");
	out.println("userName ==> " + userEntity.getUserName());
	out.println("<br/>");
	out.println("password ==> " + userEntity.getPassword());
	
%>
<br/>
<jsp:getProperty property="userName" name="userEntity"/>
<br/>
<jsp:getProperty property="password" name="userEntity"/>
</body>
</html>