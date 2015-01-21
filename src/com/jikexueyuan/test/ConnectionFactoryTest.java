package com.jikexueyuan.test;

import java.sql.Connection;

import com.jikexueyuan.util.ConnectionFactory;

/**
 * 	FileName: ConnectionFactory.java
 *	desc: 用于测试连接工厂类.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class ConnectionFactoryTest {

	public static void main(String[] args) throws Exception{
		ConnectionFactory cf = ConnectionFactory.getInstance();
		
		Connection conn = cf.makeConnection();
		
		System.out.println(conn.getAutoCommit());

	}

}
