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

		String userName = req.getParameter("uname");
		String password = req.getParameter("upwd");

		System.out.println("用户名 ==》 " + userName);
		System.out.println("密码 ==》 " + password);

		//设置HTTP响应的文档类型,此处为Text/html,如果更改为application\msword则设置为word文档格式
		//resp.setContentType("text/html");
		//设置响应所采用的编码方式
		//resp.setCharacterEncoding("UTF-8");
		
		String forward = null;

		if (userName.equals("darkmi") && password.equals("jikexueyuan")) {
			//请求转发
			//forward = "/14/success.jsp";
			forward = "http://www.jikexueyuan.com";
			//RequestDispatcher rd = req.getRequestDispatcher(forward);
			//rd.forward(req, resp);
			
			//请求重定向
			//resp.sendRedirect(req.getContextPath() + "/14/success.jsp");
			resp.sendRedirect(forward);

		} else {
			//请求转发
			//forward = "/14/error.jsp";
			forward = "http://www.jikexueyuan.com";
			//RequestDispatcher rd = req.getRequestDispatcher(forward);
			//rd.forward(req, resp);

			//请求重定向
			//resp.sendRedirect(req.getContextPath() + "/14/error.jsp");
			resp.sendRedirect(forward);
		}

	}

}
