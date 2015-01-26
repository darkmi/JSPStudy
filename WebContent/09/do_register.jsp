 <%-- 

	FileName:do_register.jsp
	desc: 通过登陆示例程序演示JSP内置对象Request对象的使用.
	Author:darkmi
	Date:2014/12/16
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userName = request.getParameter("userName");
	String skills = "";
	String[] skillArr = request.getParameterValues("skills");
	if (skills != null && skillArr.length > 0) {
		for (String skill : skillArr) {
			skills = skills + skill + "&nbsp;";
		}
	}
	
	request.setAttribute("userName", userName);
	request.setAttribute("skills", skills);

%>

<jsp:forward page="welcome.jsp"></jsp:forward>