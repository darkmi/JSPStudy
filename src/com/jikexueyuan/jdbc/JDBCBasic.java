package com.jikexueyuan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 	FileName: JDBCBasic.java
 *	desc: 一个基本的JDBC测试程序.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class JDBCBasic {
	
	 public static void main(String[] args) {
		 
	        String sql = "select * from tbl_user";
	        Connection con = null;
	        Statement st = null;
	        ResultSet rs = null;
	 
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
	            st = con.createStatement();
	            rs = st.executeQuery(sql);
	            while (rs.next()) {
	                System.out.print(rs.getInt("id") + "  ");
	                System.out.print(rs.getString("name")  + "  ");
	                System.out.print(rs.getString("password") + "  ");
	                System.out.print(rs.getString("email")  + "  ");
	                System.out.println();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                con.close();
	            } catch (Exception e) {
	            }
	 
	            try {
	                st.close();
	            } catch (Exception e) {
	            }
	 
	            try {
	                rs.close();
	            } catch (Exception e) {
	            }
	 
	        }
	 
	    }

}
