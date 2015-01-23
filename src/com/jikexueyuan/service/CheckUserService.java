package com.jikexueyuan.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dao.impl.UserDaoImpl;
import com.jikexueyuan.dto.User;
import com.jikexueyuan.util.ConnectionFactory;

public class CheckUserService {

	private UserDao userDao = new UserDaoImpl();

	public boolean check(User user) {

		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			ResultSet resultSet = userDao.get(conn, user);
			while (resultSet.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
