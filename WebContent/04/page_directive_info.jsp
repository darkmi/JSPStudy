<%-- 

FileName:declaration.jsp
desc: JSP编译指令page示例程序，演示info属性的使用。
Author:darkmi
Date:2014/12/16
Copyright:www.jikexueyuan.com
MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="UTF-8"%>
<%--设置info信息 --%>
<%@ page info="hello this is page directive" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
你好
<%=getServletInfo() %>
</body>
</html>