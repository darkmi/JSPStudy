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
response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
String newLocatin = "http://www.jikexueyuan.com";
response.setHeader("Location", newLocatin);
//response.sendRedirect("http://www.jikexueyuan.com");
%>

</body>
</html>