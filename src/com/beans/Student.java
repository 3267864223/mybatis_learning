package com.beans;

public class Student {

	private Integer stuId;
	private String stuName;
	private Integer age;
	private char gender;
	private Integer schoolId;
	private Integer roomId; 
	private Integer startAge;
	private Integer endAge;
	
	//关联
	private String schoolName;
	private String SchoolAddr;
	private String roomName;
	

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", age=" + age + ", gender=" + gender
				+ ", schoolName=" + schoolName + ", SchoolAddr=" + SchoolAddr + ", roomName=" + roomName + "]";
	}
	public Integer getStartAge() {
		return startAge;
	}
	public void setStartAge(Integer startAge) {
		this.startAge = startAge;
	}
	public Integer getEndAge() {
		return endAge;
	}
	public void setEndAge(Integer endAge) {
		this.endAge = endAge;
	}
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Integer getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddr() {
		return SchoolAddr;
	}
	public void setSchoolAddr(String schoolAddr) {
		SchoolAddr = schoolAddr;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	
	
	
	
	
}
