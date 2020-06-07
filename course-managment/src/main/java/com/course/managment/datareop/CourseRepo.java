package com.course.managment.datareop;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.course.managment.model.Courses;
@Component
public class CourseRepo {
	private HashMap<String,List<Courses>> refCourse;

	public HashMap<String, List<Courses>> getRefCourse() {
		return refCourse;
	}

	public void setRefCourse(HashMap<String, List<Courses>> refCourse) {
		this.refCourse = refCourse;
	}
}
