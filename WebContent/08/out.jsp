 <%-- 

	FileName:out.jsp
	desc: JSP内置对象Out对象示例程序.
	Author:darkmi
	Date:2014/12/16
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page  buffer="10kb" %>
<%@ page autoFlush="true" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>out对象测试</title>
</head>
<body>

<%

out.println("是否自动刷新缓冲区：" + out.isAutoFlush());
out.println("<br/>");
out.print("out对象的缓存区的初始化大小：" + out.getBufferSize());
out.println("<br/>");
out.print("out对象的剩余缓存区大小：" + out.getRemaining());
out.println("<br/>");
out.flush();
//out.print("flush之后out对象的缓存区大小：" + out.getRemaining());

//out.println("<br/>");
out.clear();
//out.print("clear之后out对象的缓存区大小：" + out.getRemaining());

//out.println("<br/>");
//out.clearBuffer();
//out.print("clearBuffer之后out对象的缓存区大小：" + out.getRemaining());

%>

</body>
</html>