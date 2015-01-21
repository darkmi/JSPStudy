package com.jikexueyuan.entity;

/**
 * 	FileName: UserEntity.java
 *	desc: 用于测试JavaBean.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class UserEntity {
	private String userName;
	private String password;

	public UserEntity() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [userName=" + userName + ", password=" + password + "]";
	}
}
