package com.jikexueyuan.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dao.impl.UserDaoImpl;
import com.jikexueyuan.dto.User;
import com.jikexueyuan.util.ConnectionFactory;

/**
 * 	FileName: UserDaoTest.java
 *	desc: 用户测试UserDAO.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class UserDaoTest {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);

			UserDao userDao = new UserDaoImpl();
			User tom = new User();
			tom.setName("Tom");
			tom.setPassword("123456");
			tom.setEmail("tom@gmail.com");
			userDao.save(conn, tom);
			System.out.println("=========保存完毕=========");
			
			User derek = new User();
			derek.setName("derek");
			derek.setPassword("abcdef");
			derek.setEmail("derek@gmail.com");
			userDao.update(conn, 11L, derek);
			System.out.println("=========更新完毕=========");
			
			User user = new User();
			user.setId(11L);
			userDao.delete(conn, user);
			System.out.println("=========删除完毕=========");

			conn.commit();
		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
