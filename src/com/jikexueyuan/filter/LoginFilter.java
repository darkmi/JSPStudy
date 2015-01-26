package com.jikexueyuan.filter;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
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
public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		// 将ServletRequest转换为HttpServletRequest      

		HttpServletRequest request = (HttpServletRequest) servletRequest;

		// 获取当前的访问路径   

		String actionUrl = request.getServletPath();

		// 获取HttpSession中的信息   

		HttpSession session = request.getSession();

		String flag = (String) session.getAttribute("flag");

		// 如果当前访问的是login.action，则说明正在进行登录操作，会放行   
		// 如果session中有flag标记，并且标记为已登录，则放行

		if ((actionUrl != null && actionUrl.equals("/login.action"))

		|| (flag != null && flag.equals("loginsuccess"))) {

			chain.doFilter(servletRequest, servletResponse);

		} else {

			// 否则，会跳转到提示信息页   

			((HttpServletResponse) servletResponse).sendRedirect(request.getContextPath() + "/lost.jsp?message="
					+ URLEncoder.encode("请登录后访问", "UTF-8"));
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
