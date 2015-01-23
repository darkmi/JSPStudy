package com.jikexueyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dto.User;

/**
 * 	FileName: UserDaoImpl.java
 *	desc: 用户DAO实现.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO tbl_user(name, password, email) values (?, ?, ?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();

	}

	/**
	 * id    准备更新的用户的ID
	 * user  新的用户信息
	 */
	@Override
	public void update(Connection conn, Long id, User user) throws SQLException {
		String updateSql = "UPDATE tbl_user SET name = ?, password = ?, email = ? WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, id);
		ps.execute();
	}

	/**
	 * 根据用户ID删除指定用户
	 */
	@Override
	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("DELETE FROM tbl_user WHERE id = ?");
		ps.setLong(1, user.getId());
		ps.execute();
	}

	@Override
	public ResultSet get(Connection conn,  User user) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM tbl_user WHERE name = ? AND password = ?");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		return ps.executeQuery();
	}

}
