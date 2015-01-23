package com.jikexueyuan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jikexueyuan.dto.User;
import com.jikexueyuan.service.CheckUserService;

public class CheckServlet extends HttpServlet {

	private static final long serialVersionUID = 7381169134016556647L;
	private CheckUserService cku = new CheckUserService();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//取得参数username的值
		String uname = request.getParameter("uname");
		String passwd = request.getParameter("upwd");
		
		System.out.println("用户名 ==》 " + uname);
		System.out.println("密码 ==》 " + passwd);

		RequestDispatcher rd = null;
		String forward = null;
		if (uname == null || passwd == null) {
			request.setAttribute("msg", "用户名或密码为空");
			rd = request.getRequestDispatcher("/14/error.jsp");
			rd.forward(request, response);
		} else {
			User user = new User();
			user.setName(uname);
			user.setPassword(passwd);
			boolean bool = cku.check(user);

			if (bool) {
				forward = "/15/success.jsp";
			} else {
				forward = "/15/error.jsp";
			}

			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}
}
