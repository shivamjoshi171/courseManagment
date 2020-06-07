package com.course.managment.model;

public class Student {
	
	private String regNumber;
	private String fName;
	private String lName;
	private String mobileNumber;
	private String password;
	
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public Student(String regNumber, String fName, String lName, String mobileNumber, String password) {
		super();
		this.regNumber = regNumber;
		this.fName = fName;
		this.lName = lName;
		this.mobileNumber = mobileNumber;
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
