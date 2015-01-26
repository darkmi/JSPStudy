 <%-- 

	FileName:register.jsp
	desc: 通过登陆示例程序演示JSP内置对象Request对象的使用.
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
<form action="do_register.jsp" method="post">
	用户名：<input type="text" name="userName"/><br/>
	特长：
	<input type="checkbox" name="skills" value="java"/>java &nbsp;
	<input type="checkbox" name="skills" value="python"/>pyton &nbsp;
	<input type="checkbox" name="skills" value="ruby"/>ruby &nbsp;
	<input type="checkbox" name="skills" value="golang"/>golang &nbsp;
	<input type="checkbox" name="skills" value="clojure"/>clojure &nbsp;
	
	<br/>
	<input type="submit" value="submit"/>
	<input type="reset" value="reset"/>
</form>

</body>
</html>