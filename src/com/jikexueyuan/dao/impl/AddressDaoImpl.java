package com.jikexueyuan.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jikexueyuan.dao.AddressDao;
import com.jikexueyuan.dto.Address;

/**
 * 	FileName: AddressDaoImpl.java
 *	desc: 地址DAO实现.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class AddressDaoImpl implements AddressDao {

	/**
	 * 保存用户的地址信息
	 */
	@Override
	public void save(Connection conn, Address address) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("INSERT INTO tbl_user(name, password, email) values (?, ?, ?)");
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getUserId());
		ps.execute();

	}

	/**
	 * 根据ID更新地址信息
	 */
	@Override
	public void update(Connection conn, Long id, Address address) throws SQLException {
		String updateSql = "UPDATE tbl_address SET city = ?, country = ?, WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		ps.setString(1, address.getCity());
		ps.setString(2, address.getCountry());
		ps.setLong(3, address.getId());
		ps.execute();

	}

	/**
	 * 根据ID删除地址信息
	 */
	@Override
	public void delete(Connection conn, Address address) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("DELETE FROM tbl_address WHERE id = ?");
		ps.setLong(1, address.getId());
		ps.execute();
	}

}
