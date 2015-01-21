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