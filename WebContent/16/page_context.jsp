<%-- 

	FileName: page_context.jsp
	desc: JSP的内置对象pageContext的使用示例，该对象其实没有什么实际用途，大家了解即可。
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
<title>pageContext对象使用示例</title>
</head>
<body>

	<!-- 使用pageContext对象获取到out对象 -->
	<%
		JspWriter myOut = pageContext.getOut();
		out.println("hello world.");
	%>

	<!-- 使用pageContext对象获取到out对象 -->
	<%
		//pageContext.setAttribute("darkmi", "jikexueyuan", pageContext.SESSION_SCOPE);
		//明确指定获取范围
		//out.println("session范围内可以找到key为darkmi键值对：" + pageContext.getAttribute("darkmi", pageContext.SESSION_SCOPE));
		//out.println("<br/>");

		/*
		 *不明确指定获取范围的话就从page范围寻找指定的key，
		 *此处输出为null，因为page范围没有key为darkmi的键值对
		 */
		//out.println("page范围是没有key为darkmi键值对的：" + pageContext.getAttribute("darkmi"));
		//out.println("<br/>");

		/*
		 *按照 page > request > session > application 这个顺序寻找指定key的键值对
		 */
		//out.println("顺序查找所有范围，可以找到：" + pageContext.findAttribute("darkmi"));
	%>
</body>
</html>