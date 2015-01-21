package com.jikexueyuan.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.jikexueyuan.dto.Address;

/**
 * 	FileName: AddressDao.java
 *	desc: 地址DAO接口定义.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public interface AddressDao {
	public void save(Connection conn, Address address) throws SQLException;

	public void update(Connection conn, Long id, Address address) throws SQLException;

	public void delete(Connection conn, Address address) throws SQLException;

}
