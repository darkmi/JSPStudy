package com.jikexueyuan.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jikexueyuan.dto.User;

/**
 * 	FileName: UserDao.java
 *	desc: 用户DAO接口定义.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public interface UserDao {

	public void save(Connection conn, User user) throws SQLException;

	public void update(Connection conn, Long id, User user) throws SQLException;

	public void delete(Connection conn, User user) throws SQLException;
	
	/**
	 * 根据用户名和密码获取用户信息
	 * @param User
	 * @throws SQLException
	 */
	public ResultSet get(Connection conn, User user)throws SQLException;

}
