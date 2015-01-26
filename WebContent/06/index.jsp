<%-- 

	FileName:index.jsp
	desc: 动作指令include示例程序.
	Author:darkmi
	Date:2014/12/16
	Copyright:www.jikexueyuan.com
	MyBlog:blog.darkmi.com

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.html"></jsp:include>

<jsp:include page="body.jsp">
	<jsp:param value="red" name="bgcolor"/>
</jsp:include>

</html>