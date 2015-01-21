package com.jikexueyuan.dto;

/**
 * 	FileName: Address.java
 *	desc: 地址实体类.
 *	Date: 2015/01/21
 *	Copyright: www.jikexueyuan.com
 *	MyBlog: blog.darkmi.com
 *  @author darkmi
 *
 */
public class Address extends IdEntity {

	private String city;
	private String country;
	private Long userId;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", userId=" + userId + ", id=" + id + "]";
	}

}
