package com.jikexueyuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 	FileName: HelloServlet.java
 *	desc: Servlet课程中的第一个示例,用户向浏览器输出一个字符串："Hello World."
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -4504409472304017973L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("======= init with config parameter =======");
		super.init(config);
	}

	@Override
	public void init() throws ServletException {
		System.out.println("======= init without config parameter =======");
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("======= service with config parameter =======");
		PrintWriter out = resp.getWriter();
		out.println("Hello World.");
		//out.flush();
		//super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("======= destroy with config parameter =======");
		super.destroy();
	}

}
