 <%-- 

	FileName:register.jsp
	desc: 动作指令useBean示例程序.
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
<title>注册页面</title>
</head>
<body>
<form action="do_register.jsp">
<label>用户名</label>
<input type="text" id="userName" name="userName"/>
<label>密码</label>
<input type="password" id="password" name="password">
<input type="submit" value="submit"/>
<input type="reset" value="reset">


</form>
</body>
</html>