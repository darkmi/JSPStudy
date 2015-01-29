package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet16 extends HttpServlet {

	private static final long serialVersionUID = 747710184283333182L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//取得参数username的值
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("upwd");
		String returnUri = request.getParameter("return_uri");
		System.out.println("用户名 ==》 " + uname);
		System.out.println("密码 ==》 " + passwd);
		System.out.println("return uri ==> " + returnUri);

		RequestDispatcher rd = null;
		if (uname == null || passwd == null) {
			request.setAttribute("msg", "用户名或密码为空");
			rd = request.getRequestDispatcher("/16/login.jsp");
			rd.forward(request, response);
		} else {
			if (uname.equals("极客学院") && passwd.equals("123456")) {
				request.getSession().setAttribute("flag", "login_success");
				if (returnUri != null) {
					rd = request.getRequestDispatcher(returnUri);
					rd.forward(request, response);
				} else {
					rd = request.getRequestDispatcher("/16/index.jsp");
					rd.forward(request, response);
				}
			} else {
				request.getSession().setAttribute("flag", "login_error");
				request.setAttribute("msg", "用户名或密码错误！");
				rd = request.getRequestDispatcher("/16/login.jsp");
				rd.forward(request, response);
			}
		}
	}

}
