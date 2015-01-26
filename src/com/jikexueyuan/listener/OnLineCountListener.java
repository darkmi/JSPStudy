package com.jikexueyuan.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnLineCountListener implements HttpSessionListener, ServletContextListener,
		ServletContextAttributeListener {

	private int count;
	@SuppressWarnings("unused")
	private ServletContext context = null;

	public OnLineCountListener() {
		count = 0;
	}

	//context初始化时激发
	public void contextInitialized(ServletContextEvent event) {
		this.context = event.getServletContext();
		log("contextInitialized()");
	}

	//context删除时激发
	public void contextDestroyed(ServletContextEvent event) {
		log("contextDestroyed()");
		this.context = null;
	}

	//创建一个session时激发
	public void sessionCreated(HttpSessionEvent se) {
		count++;
		setContext(se);
	}

	//当一个session失效时激发
	public void sessionDestroyed(HttpSessionEvent se) {
		count--;
		setContext(se);
	}

	//设置context的属性，它将激发attributeReplaced或attributeAdded方法
	public void setContext(HttpSessionEvent se) {
		se.getSession().getServletContext().setAttribute("onLine", new Integer(count));
	}

	//增加一个新的属性时激发
	public void attributeAdded(ServletContextAttributeEvent event) {
		log("attributeAdded('" + event.getName() + "', '" + event.getValue() + "')");
	}

	//删除一个新的属性时激发
	public void attributeRemoved(ServletContextAttributeEvent event) {
		log("attributeRemoved('" + event.getName() + "', '" + event.getValue() + "')");
	}

	//属性被替代时激发
	public void attributeReplaced(ServletContextAttributeEvent event) {
		log("attributeReplaced('" + event.getName() + "', '" + event.getValue() + "')");
	}

	private void log(String message) {
		System.out.println("ContextListener: " + message);
	}

}
