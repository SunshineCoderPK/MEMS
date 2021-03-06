package com.kaipan.mems.domain;
// Generated 2017-4-27 21:51:34 by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo generated by hbm2java
 */
public class Userinfo implements java.io.Serializable {

	private String stuOrEmpId;
	private String name;
	private Boolean sex;
	private Integer age;
	private String password;
	private String email;
	private String idcard;
	private String phoneNo;
	private int roleId;
	private Integer graduationYear;
	private Integer seniority;
	private String department;
	private String job;
	private Boolean isDelete;
	private String imgsrc;
//	private Set expenses = new HashSet(0);

	public Userinfo() {
	}

	public Userinfo(String stuOrEmpId, String name, String password, String idcard, int roleId) {
		this.stuOrEmpId = stuOrEmpId;
		this.name = name;
		this.password = password;
		this.idcard = idcard;
		this.roleId = roleId;
	}

	public Userinfo(String stuOrEmpId, String name, Boolean sex, Integer age, String password, String email,
			String idcard, String phoneNo, int roleId, Integer graduationYear, Integer seniority, String department,
			String job, Boolean isDelete, String imgsrc) {
		this.stuOrEmpId = stuOrEmpId;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.password = password;
		this.email = email;
		this.idcard = idcard;
		this.phoneNo = phoneNo;
		this.roleId = roleId;
		this.graduationYear = graduationYear;
		this.seniority = seniority;
		this.department = department;
		this.job = job;
		this.isDelete=isDelete;
		this.imgsrc=imgsrc;
//		this.expenses = expenses;
	}

	public String getStuOrEmpId() {
		return this.stuOrEmpId;
	}

	public void setStuOrEmpId(String stuOrEmpId) {
		this.stuOrEmpId = stuOrEmpId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return this.sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Integer getGraduationYear() {
		return this.graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Integer getSeniority() {
		return this.seniority;
	}

	public void setSeniority(Integer seniority) {
		this.seniority = seniority;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	public Boolean getIsDelete() {
		return isDelete;
	}
	
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
    
	public String getImgsrc() {
		return imgsrc;
	}
	
	public void setImgsrc(String imgsrc) {
		this.imgsrc = imgsrc;
	}
//	public Set getExpenses() {
//		return this.expenses;
//	}
//
//	public void setExpenses(Set expenses) {
//		this.expenses = expenses;
//	}

}
