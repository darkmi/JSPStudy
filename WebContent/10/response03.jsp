 <%-- 

	FileName:response03.jsp
	desc: JSP内置对象Response对象示例程序3.
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
<title>Insert title here</title>
</head>
<body>
<%
	
	Cookie mycookie = new Cookie("jikexueyuan", "darkmi");
	mycookie.setMaxAge(3600);
	mycookie.setPath("/");
	response.addCookie(mycookie);
	response.getOutputStream();
	response.getWriter();
%>

</body>
</html>