<%-- 

	FileName:welcome.jsp
	desc: JSP的session对象示例2：欢迎页面，根据session中不同的值显示不同的信息。
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
<title>session对象示例2：欢迎页面</title>
</head>

<body>
	<%
		if (session.getAttribute("userid") != null) {
	%>
	<h2>
		欢迎：<%=session.getAttribute("userid")%>
	</h2>
	<a href="logout.jsp">注销</a>
	<br>
	<%
		} else {
	%>
	请先登录！
	<a href="login.jsp">登录</a>
	<%
		}
	%>

<%
	if (session.isNew()) {
%>
<h2>欢迎新用户!!!</h2>
<%
	} else {
%>
<h2>您已经是老用户了！！！</h2>
<%
	}
%>
</body>
</html>