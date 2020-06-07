package com.course.managment.model;

import java.util.List;

import org.springframework.stereotype.Component;

public class Courses {
	
	private String courseName;
	private String credits;
	private String teacher;
	
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCredits() {
		return credits;
	}
	public void setCredits(String credits) {
		this.credits = credits;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
}
