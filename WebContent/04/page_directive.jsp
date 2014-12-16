<%-- 

FileName:declaration.jsp
desc: JSP编译指令page示例程序.
Author:darkmi
Date:2014/12/16
Copyright:www.jikexueyuan.com
MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%--示例1：多行import多个package --%>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.HashMap" %>

<%--示例2：单行import多个package --%>
<%@ page import="java.util.Date,java.util.ArrayList" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello world</title>
</head>
<body>
<%--<%= new Date().toString() --%>
</body>
</html>