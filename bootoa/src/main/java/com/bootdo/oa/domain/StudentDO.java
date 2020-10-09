package com.bootdo.oa.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-09-30 15:14:56
 */
public class StudentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer sid;
	//姓名
	private String sname;
	//性别
	private String sex;
	//爱好
	private String hobby;
	//生日
	private Date birthday;
	//电话号码
	private String number;
	//住址
	private String address;

	/**
	 * 设置：
	 */
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	/**
	 * 获取：
	 */
	public Integer getSid() {
		return sid;
	}
	/**
	 * 设置：姓名
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * 获取：姓名
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：爱好
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	/**
	 * 获取：爱好
	 */
	public String getHobby() {
		return hobby;
	}
	/**
	 * 设置：生日
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * 获取：生日
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * 设置：电话号码
	 */
	public void setNumber(String number) {
		this.number = number;
	}
	/**
	 * 获取：电话号码
	 */
	public String getNumber() {
		return number;
	}
	/**
	 * 设置：住址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：住址
	 */
	public String getAddress() {
		return address;
	}
}
