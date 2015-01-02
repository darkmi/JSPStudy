<%-- 

	FileName:logout.jsp
	desc: JSP的session对象示例2：执行会话清理逻辑.
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
<title>退出页面</title>
</head>
<body>
<%
	//使当前session失效
	session.invalidate();
	
	//或者移除指定属性值也可以
	//session.removeAttribute("userid");
	response.setHeader("refresh", "2;URL=welcome.jsp");

%>

</body>
</html>