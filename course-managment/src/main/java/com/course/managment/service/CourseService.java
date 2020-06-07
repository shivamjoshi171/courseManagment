package com.course.managment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.managment.impliment.CourseImp;
import com.course.managment.model.Courses;

@Service
public class CourseService {
	
	@Autowired
	private CourseImp course;
	
	
	public void addCourse(String id,Courses course) {
		this.course.addCourse(id, course);
	}
	
	public List<Courses> getRegCourse(String id) {
		return course.getAllCourse(id);
	}
	
	
}
