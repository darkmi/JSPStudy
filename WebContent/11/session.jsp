<%-- 

	FileName:session.jsp
	desc: JSP的session对象示例.
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
<title>session对象示例1</title>
</head>
<body>
session的唯一标识符：<%= session.getId() %><br/>
session的创建时间：<%= new java.util.Date(session.getCreationTime()).toString() %><br/>
session的最后访问时间：<%= new java.util.Date(session.getLastAccessedTime()).toString() %><br/>
session默认的失效时间：<%=session.getMaxInactiveInterval() %><br/>

<%
//将session的失效时间设置为60秒
session.setMaxInactiveInterval(60);
%>
将session的失效时间设置为60秒：<%=session.getMaxInactiveInterval() %><br/>

</body>
</html>