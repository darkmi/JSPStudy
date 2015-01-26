<%-- 

	FileName:error.jsp
	desc: JSP+Servlet+JDBC实现登陆逻辑.
	Author:darkmi
	Date:2015/01/21
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆失败提示页面</title>
<style type="text/css">
body {
	color: #000;
	font-size: 14px;
	margin: 20px auto;
}

#message{
	text-align: center;
}

</style>
</head>
<body>

<div id="message">
登陆失败.<br/>

错误提示：
<%
	Object obj = request.getAttribute("msg");
	if(obj != null){
		out.println(obj.toString());
	}else{
		out.println("无");
	}
%>

您提交的信息为：<br/>
用户名：<%= request.getParameter("uname") %><br/>
密码：<%= request.getParameter("upwd") %><br/>

<a href="<%=request.getContextPath() %>/15/login.jsp">返回登陆页面</a>

</div>

</body>
</html>