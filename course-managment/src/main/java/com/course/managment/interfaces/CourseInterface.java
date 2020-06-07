package com.course.managment.interfaces;

import java.util.List;

import com.course.managment.model.Courses;

public interface CourseInterface {
		List<Courses> getAllCourse(String id);
		void addCourse(String id,Courses course);
		
		
}
