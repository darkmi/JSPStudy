package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 6520550639750164887L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName =  req.getParameter("uname");
		String password = req.getParameter("upwd");
		
		System.out.println("用户名 ==》 " + userName);
		System.out.println("密码 ==》 " + password);
		
		

	}	

}
