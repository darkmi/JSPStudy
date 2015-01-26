<%-- 

	FileName:do_login.jsp
	desc: JSP的session对象示例2：执行登陆逻辑.
	Author:darkmi
	Date:2014/12/30
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<%
		String name = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		System.out.println("name ==> " + name);
		System.out.println("upwd ==> " + upwd);
		if (name != null  && upwd != null ) {
			//定时跳转
			session.setAttribute("userid", name);
			response.setHeader("refresh", "2;URL=welcome.jsp");
		}
	%>
