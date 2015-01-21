package com.jikexueyuan.dto;

/**
 * 	FileName: IdEntity.java
 *	desc: 所有实体类的父类,主键定义.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public abstract class IdEntity {

	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
