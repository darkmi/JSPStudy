package com.jikexueyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 	FileName: TransactionTest.java
 *	desc: 测试JDBC的事务管理功能.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class TransactionTest {

	/* 获取数据库连接的函数*/
	public static Connection getConnection() {
		Connection con = null; //创建用于连接数据库的Connection对象  
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动  

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");// 创建数据连接  

		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return con; //返回所建立的数据库连接  
	}

	public static void insertUserData(Connection conn) throws SQLException {

		String sql = "INSERT INTO tbl_user(id, name, password, email) VALUES (10, 'Tom', '123456', 'tom@gmail.com')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向用户表中插入了 " + count + " 条记录");

	}

	public static void insertAddressData(Connection conn) throws SQLException {

		String sql = "INSERT INTO tbl_address(id, city, country, user_id)" + "VALUES(1, 'shanghai', 'china', '10')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向地址表中插入了 " + count + " 条记录");

	}

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = getConnection();
			// set auto commit to false
			con.setAutoCommit(false);
			insertUserData(con);
			insertAddressData(con);
			// now commit transaction
			con.commit();
		} catch (SQLException e) {
			System.out.println("==== 捕获到SQL Exception ====");

			e.printStackTrace();

			try {
				con.rollback();
				System.out.println("JDBC Transaction rolled back successfully");
			} catch (SQLException e1) {
				System.out.println("SQLException in rollback" + e1.getMessage());
			}
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
