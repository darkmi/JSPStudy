package com.jikexueyuan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 	FileName: LoginFilter.java
 *	desc: 一个用于执行登陆验证的过滤器.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class PermissionFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("权限校验过滤器 { ");
		// 将ServletRequest转换为HttpServletRequest      
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		// 获取当前的访问路径
		//String contextPath = request.getContextPath();
		//System.out.println("contextPath ==> " + contextPath);
		//String requestUri = request.getRequestURI();
		//System.out.println("Request Uri ==> " + requestUri);

		String servletPath = request.getServletPath();
		System.out.println("Servlet Path ==> " + servletPath);

		// 获取HttpSession中的信息   
		HttpSession session = request.getSession();
		String flag = (String) session.getAttribute("flag");

		//权限校验
		if (servletPath != null
				&& (servletPath.equals("/16/login.jsp") || servletPath.equals("/LoginServlet16") || servletPath
						.equals("/16/index.jsp"))) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			//访问非登录页面时
			if (flag != null && flag.equals("login_success")) {
				chain.doFilter(servletRequest, servletResponse);
			} else if (flag != null && flag.equals("login_error")) {
				request.setAttribute("msg", "登陆失败，请重新登录!<br/>");
				request.setAttribute("return_uri", servletPath);
				RequestDispatcher rd = request.getRequestDispatcher("/16/login.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("msg", "您尚未登陆！<br/>");
				request.setAttribute("return_uri", servletPath);
				RequestDispatcher rd = request.getRequestDispatcher("/16/login.jsp");
				rd.forward(request, response);
			}
		}
		System.out.println("权限校验过滤器 } ");
	}

	@Override
	public void destroy() {
	}

}
