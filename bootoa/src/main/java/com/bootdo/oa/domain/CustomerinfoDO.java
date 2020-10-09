package com.bootdo.oa.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 
 * 
 * @author ych
 * @email 1992lcg@163.com
 * @date 2020-07-22 14:27:25
 */
public class CustomerinfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//客户编号
	private String customerCode;
	//客户姓名
	private String customerName;
	//客户性别（0-男，1-女）
	private Integer customerSex;
	//联系电话
	private String customerTel;
	//出生日期
	private Date customerBirth;
	//毕业院校
	private String customerUniversity;
	//所学专业
	private String customerSpecialities;
	//简历来源
	private Integer resumeSource;
	//简历更新时间
	private Date resumeUpdate;
	//技术特长
	private String technicalExpertise;
	//简历路径
	private String resumePath;
	//添加时间
	private Date addTime;
	//操作员编号
	private String opertCode;
	//学历
	private Long education;
	//英语水平
	private Long englishLevel;
	//日语水平
	private Long japaneseLevel;
	//
	private String email;
	//小析智能简历id
	private String cvId;
	//简历方向 : 1:国内 2:对日
	private Integer resumeDirection;
	//确认工作年限
	private BigDecimal confirmYear;
	//学信网是否可查（0-否，1-是）
	private Integer chsiFlag;

	/**
	 * 设置：客户编号
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * 获取：客户编号
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * 设置：客户姓名
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：客户姓名
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：客户性别（0-男，1-女）
	 */
	public void setCustomerSex(Integer customerSex) {
		this.customerSex = customerSex;
	}
	/**
	 * 获取：客户性别（0-男，1-女）
	 */
	public Integer getCustomerSex() {
		return customerSex;
	}
	/**
	 * 设置：联系电话
	 */
	public void setCustomerTel(String customerTel) {
		this.customerTel = customerTel;
	}
	/**
	 * 获取：联系电话
	 */
	public String getCustomerTel() {
		return customerTel;
	}
	/**
	 * 设置：出生日期
	 */
	public void setCustomerBirth(Date customerBirth) {
		this.customerBirth = customerBirth;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getCustomerBirth() {
		return customerBirth;
	}
	/**
	 * 设置：毕业院校
	 */
	public void setCustomerUniversity(String customerUniversity) {
		this.customerUniversity = customerUniversity;
	}
	/**
	 * 获取：毕业院校
	 */
	public String getCustomerUniversity() {
		return customerUniversity;
	}
	/**
	 * 设置：所学专业
	 */
	public void setCustomerSpecialities(String customerSpecialities) {
		this.customerSpecialities = customerSpecialities;
	}
	/**
	 * 获取：所学专业
	 */
	public String getCustomerSpecialities() {
		return customerSpecialities;
	}
	/**
	 * 设置：简历来源
	 */
	public void setResumeSource(Integer resumeSource) {
		this.resumeSource = resumeSource;
	}
	/**
	 * 获取：简历来源
	 */
	public Integer getResumeSource() {
		return resumeSource;
	}
	/**
	 * 设置：简历更新时间
	 */
	public void setResumeUpdate(Date resumeUpdate) {
		this.resumeUpdate = resumeUpdate;
	}
	/**
	 * 获取：简历更新时间
	 */
	public Date getResumeUpdate() {
		return resumeUpdate;
	}
	/**
	 * 设置：技术特长
	 */
	public void setTechnicalExpertise(String technicalExpertise) {
		this.technicalExpertise = technicalExpertise;
	}
	/**
	 * 获取：技术特长
	 */
	public String getTechnicalExpertise() {
		return technicalExpertise;
	}
	/**
	 * 设置：简历路径
	 */
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	/**
	 * 获取：简历路径
	 */
	public String getResumePath() {
		return resumePath;
	}
	/**
	 * 设置：添加时间
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * 获取：添加时间
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * 设置：操作员编号
	 */
	public void setOpertCode(String opertCode) {
		this.opertCode = opertCode;
	}
	/**
	 * 获取：操作员编号
	 */
	public String getOpertCode() {
		return opertCode;
	}
	/**
	 * 设置：学历
	 */
	public void setEducation(Long education) {
		this.education = education;
	}
	/**
	 * 获取：学历
	 */
	public Long getEducation() {
		return education;
	}
	/**
	 * 设置：英语水平
	 */
	public void setEnglishLevel(Long englishLevel) {
		this.englishLevel = englishLevel;
	}
	/**
	 * 获取：英语水平
	 */
	public Long getEnglishLevel() {
		return englishLevel;
	}
	/**
	 * 设置：日语水平
	 */
	public void setJapaneseLevel(Long japaneseLevel) {
		this.japaneseLevel = japaneseLevel;
	}
	/**
	 * 获取：日语水平
	 */
	public Long getJapaneseLevel() {
		return japaneseLevel;
	}
	/**
	 * 设置：
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：小析智能简历id
	 */
	public void setCvId(String cvId) {
		this.cvId = cvId;
	}
	/**
	 * 获取：小析智能简历id
	 */
	public String getCvId() {
		return cvId;
	}
	/**
	 * 设置：简历方向 : 1:国内 2:对日
	 */
	public void setResumeDirection(Integer resumeDirection) {
		this.resumeDirection = resumeDirection;
	}
	/**
	 * 获取：简历方向 : 1:国内 2:对日
	 */
	public Integer getResumeDirection() {
		return resumeDirection;
	}
	/**
	 * 设置：确认工作年限
	 */
	public void setConfirmYear(BigDecimal confirmYear) {
		this.confirmYear = confirmYear;
	}
	/**
	 * 获取：确认工作年限
	 */
	public BigDecimal getConfirmYear() {
		return confirmYear;
	}
	/**
	 * 设置：学信网是否可查（0-否，1-是）
	 */
	public void setChsiFlag(Integer chsiFlag) {
		this.chsiFlag = chsiFlag;
	}
	/**
	 * 获取：学信网是否可查（0-否，1-是）
	 */
	public Integer getChsiFlag() {
		return chsiFlag;
	}
}
