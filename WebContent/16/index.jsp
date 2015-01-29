<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	首页
	<br />
	<br /> 访问
	<a href="<%=request.getContextPath()%>/16/hello.jsp">hello.jsp</a>
	<br />
	<br />

	<%
		String flag = "";
		Object obj = session.getAttribute("flag");
		if (obj != null) {
			flag = obj.toString();
		}
		if (flag.equals("login_success")) {
	%>
	<a href="<%=request.getContextPath()%>/LogoutServlet16">退出</a>
	<%
		} else {
	%>
	<a href="<%=request.getContextPath()%>/16/login.jsp">登录</a>
	<%
		}
	%>

</body>
</html>