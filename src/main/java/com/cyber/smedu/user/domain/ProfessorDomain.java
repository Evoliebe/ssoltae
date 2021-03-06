package com.cyber.smedu.user.domain;

import java.sql.Timestamp;

public class ProfessorDomain {
	
	private String userCode;
	private String departmentCode;
	private String departmentName;
	private String userId;
	private String userPw;
	private String userName;
	private String userBirth;
	private String userGender;
	private String userAddress;
	private String userPhone;
	private String userEmail;
	private String userEducational;
	private String userLevel;
	private Timestamp userJoinDate;
	private String userState;
	private Timestamp userOutDate;
	private String professorCode;
	private String professorBachelor;
	private String professorMaster;
	private String professorDoctor;
	private String professorCareer;
	
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEducational() {
		return userEducational;
	}
	public void setUserEducational(String userEducational) {
		this.userEducational = userEducational;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public Timestamp getUserJoinDate() {
		return userJoinDate;
	}
	public void setUserJoinDate(Timestamp userJoinDate) {
		this.userJoinDate = userJoinDate;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public Timestamp getUserOutDate() {
		return userOutDate;
	}
	public void setUserOutDate(Timestamp userOutDate) {
		this.userOutDate = userOutDate;
	}
	public String getProfessorCode() {
		return professorCode;
	}
	public void setProfessorCode(String professorCode) {
		this.professorCode = professorCode;
	}
	public String getProfessorBachelor() {
		return professorBachelor;
	}
	public void setProfessorBachelor(String professorBachelor) {
		this.professorBachelor = professorBachelor;
	}
	public String getProfessorMaster() {
		return professorMaster;
	}
	public void setProfessorMaster(String professorMaster) {
		this.professorMaster = professorMaster;
	}
	public String getProfessorDoctor() {
		return professorDoctor;
	}
	public void setProfessorDoctor(String professorDoctor) {
		this.professorDoctor = professorDoctor;
	}
	public String getProfessorCareer() {
		return professorCareer;
	}
	public void setProfessorCareer(String professorCareer) {
		this.professorCareer = professorCareer;
	}
	@Override
	public String toString() {
		return "ProfessorDomain [userCode=" + userCode + ", departmentCode=" + departmentCode + ", userId=" + userId
				+ ", userPw=" + userPw + ", userName=" + userName + ", userBirth=" + userBirth + ", userGender="
				+ userGender + ", userAddress=" + userAddress + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", userEducational=" + userEducational + ", userLevel=" + userLevel + ", userJoinDate=" + userJoinDate
				+ ", userState=" + userState + ", userOutDate=" + userOutDate + ", professorCode=" + professorCode
				+ ", professorBachelor=" + professorBachelor + ", professorMaster=" + professorMaster
				+ ", professorDoctor=" + professorDoctor + ", professorCareer=" + professorCareer + "]";
	}
	

}
