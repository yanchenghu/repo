package com.bootdo.per.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 简历表
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-10-22 17:00:26
 */
public class CustomerinfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//简历编号
	private String customerCode;
	//简历姓名
	private String customerName;
	//简历性别（0-男，1-女）
	private Integer customerSex;
	//联系电话
	private String customerTel;
	//出生日期
	private Date customerBirth;
	//毕业院校
	private String customerUniversity;
	//专业
	private String customerSpecialities;
	//入职时间
	private Date entryTime;
	//工作年限
	private Integer workYear;
	//简历来源
	private Integer resumeSource;
	//简历ID
	private String resumeId;
	//简历地址
	private String resumePath;
	//与梓钦关系（1-已离职、2-在职、3-提交简历未通过、4-待入职、5-无关系 6-入职）
	private Integer relationshipZq;
	//添加时间
	private Date addTime;
	//更新时间
	private Date updateTime;
	//操作员编号
	private String opertCode;
	//操作员姓名
	private String opertName;
	//期望薪资
	private String expectationSalary;
	//技术方向
	private String professionId;
	//意向地区
	private String intentionArea;
	//学历(1、初中2、高中3、专科4、本科5、研究生6、博士7、其它)
	private Integer education;
	//入项次数
	private Integer entryTimes;
	//入项状态（1-未入项   2-已入项  3-已离项   4-已离职）
	private Integer joinStatus;
	//抢占人（如果为空，说明未被抢占，否则说明被抢占）
	private String signPeople;
	//学信网是否可查（0-否，1-是）
	private Integer chsiFlag;
	//简历方向 : 1:国内 2:对日
	private Integer resumeDirection;

	/**
	 * 设置：简历编号
	 */
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	/**
	 * 获取：简历编号
	 */
	public String getCustomerCode() {
		return customerCode;
	}
	/**
	 * 设置：简历姓名
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * 获取：简历姓名
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * 设置：简历性别（0-男，1-女）
	 */
	public void setCustomerSex(Integer customerSex) {
		this.customerSex = customerSex;
	}
	/**
	 * 获取：简历性别（0-男，1-女）
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
	 * 设置：专业
	 */
	public void setCustomerSpecialities(String customerSpecialities) {
		this.customerSpecialities = customerSpecialities;
	}
	/**
	 * 获取：专业
	 */
	public String getCustomerSpecialities() {
		return customerSpecialities;
	}
	/**
	 * 设置：入职时间
	 */
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	/**
	 * 获取：入职时间
	 */
	public Date getEntryTime() {
		return entryTime;
	}
	/**
	 * 设置：工作年限
	 */
	public void setWorkYear(Integer workYear) {
		this.workYear = workYear;
	}
	/**
	 * 获取：工作年限
	 */
	public Integer getWorkYear() {
		return workYear;
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
	 * 设置：简历ID
	 */
	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}
	/**
	 * 获取：简历ID
	 */
	public String getResumeId() {
		return resumeId;
	}
	/**
	 * 设置：简历地址
	 */
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	/**
	 * 获取：简历地址
	 */
	public String getResumePath() {
		return resumePath;
	}
	/**
	 * 设置：与梓钦关系（1-已离职、2-在职、3-提交简历未通过、4-待入职、5-无关系 6-入职）
	 */
	public void setRelationshipZq(Integer relationshipZq) {
		this.relationshipZq = relationshipZq;
	}
	/**
	 * 获取：与梓钦关系（1-已离职、2-在职、3-提交简历未通过、4-待入职、5-无关系 6-入职）
	 */
	public Integer getRelationshipZq() {
		return relationshipZq;
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
	 * 设置：更新时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdateTime() {
		return updateTime;
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
	 * 设置：操作员姓名
	 */
	public void setOpertName(String opertName) {
		this.opertName = opertName;
	}
	/**
	 * 获取：操作员姓名
	 */
	public String getOpertName() {
		return opertName;
	}
	/**
	 * 设置：期望薪资
	 */
	public void setExpectationSalary(String expectationSalary) {
		this.expectationSalary = expectationSalary;
	}
	/**
	 * 获取：期望薪资
	 */
	public String getExpectationSalary() {
		return expectationSalary;
	}
	/**
	 * 设置：技术方向
	 */
	public void setProfessionId(String professionId) {
		this.professionId = professionId;
	}
	/**
	 * 获取：技术方向
	 */
	public String getProfessionId() {
		return professionId;
	}
	/**
	 * 设置：意向地区
	 */
	public void setIntentionArea(String intentionArea) {
		this.intentionArea = intentionArea;
	}
	/**
	 * 获取：意向地区
	 */
	public String getIntentionArea() {
		return intentionArea;
	}
	/**
	 * 设置：学历(1、初中2、高中3、专科4、本科5、研究生6、博士7、其它)
	 */
	public void setEducation(Integer education) {
		this.education = education;
	}
	/**
	 * 获取：学历(1、初中2、高中3、专科4、本科5、研究生6、博士7、其它)
	 */
	public Integer getEducation() {
		return education;
	}
	/**
	 * 设置：入项次数
	 */
	public void setEntryTimes(Integer entryTimes) {
		this.entryTimes = entryTimes;
	}
	/**
	 * 获取：入项次数
	 */
	public Integer getEntryTimes() {
		return entryTimes;
	}
	/**
	 * 设置：入项状态（1-未入项   2-已入项  3-已离项   4-已离职）
	 */
	public void setJoinStatus(Integer joinStatus) {
		this.joinStatus = joinStatus;
	}
	/**
	 * 获取：入项状态（1-未入项   2-已入项  3-已离项   4-已离职）
	 */
	public Integer getJoinStatus() {
		return joinStatus;
	}
	/**
	 * 设置：抢占人（如果为空，说明未被抢占，否则说明被抢占）
	 */
	public void setSignPeople(String signPeople) {
		this.signPeople = signPeople;
	}
	/**
	 * 获取：抢占人（如果为空，说明未被抢占，否则说明被抢占）
	 */
	public String getSignPeople() {
		return signPeople;
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
}
