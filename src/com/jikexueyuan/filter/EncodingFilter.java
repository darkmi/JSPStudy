package com.jikexueyuan.filter;

import java.io.IOException;

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
	String charEncoding = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		//System.out.println("======= 初始化编码过滤器 =======");
		charEncoding = filterConfig.getInitParameter("encoding");
		if (charEncoding == null) {
			throw new ServletException("EncodingFilter的编码设置为空！！！");
		} else {
			//获取初始化参数配置
			System.out.println("charSet: " + charEncoding);
		}

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		//System.out.println("======= 重置请求和响应的编码 =======");
		HttpServletRequest hreq = (HttpServletRequest) request;
		HttpServletResponse hres = (HttpServletResponse) response;

		if (!charEncoding.equals(request.getCharacterEncoding())) {
			request.setCharacterEncoding(charEncoding);
		}
		hres.setCharacterEncoding(charEncoding);
		chain.doFilter(hreq, hres);
	}

	@Override
	public void destroy() {
		//System.out.println("======= destory filter =======");
	}
}
