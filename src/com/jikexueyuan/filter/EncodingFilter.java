package com.jikexueyuan.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 	FileName: LoginFilter.java
 *	desc: 一个用于执行编码转换的过滤器.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class EncodingFilter implements Filter {
	String charSet = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("======= init filter =======");

		charSet = filterConfig.getInitParameter("charSet");
		String filterName = filterConfig.getFilterName();
		Enumeration<String> nameEnum = filterConfig.getInitParameterNames();

		//获取初始化参数配置
		System.out.println("charSet: " + charSet);
		System.out.println("filterName: " + filterName);

		while (nameEnum.hasMoreElements()) {
			System.out.println("nameEnum: " + nameEnum.nextElement().toString());
		}

		if (charSet == null) {
			charSet = "GBK";
		}

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		System.out.println("======= do filter =======");
		System.out.println("正执行字符过滤。。。");

		HttpServletRequest hreq = (HttpServletRequest) request;
		HttpServletResponse hres = (HttpServletResponse) response;

		hreq.setCharacterEncoding(charSet);
		hres.setCharacterEncoding(charSet);

		chain.doFilter(hreq, hres);

	}

	@Override
	public void destroy() {
		System.out.println("======= destory filter =======");

	}

}
