<%-- 

	FileName:counter.jsp
	desc: JSP的application对象示例：使用application对象实现一个简单的计数器功能.
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
<title>简单计数器</title>
</head>
<body>
<%
	Object obj = application.getAttribute("counter");
	if(obj == null){
		application.setAttribute("counter", new Integer(1));
		out.println("该页面被访问了 1 次<br/>");
	}else{
		int counterValue = Integer.parseInt(obj.toString());
		out.println("该页面被访问了 " + counterValue + " 次<br/>");
		counterValue++;
		application.setAttribute("counter", counterValue);
	}
%>
</body>
</html>