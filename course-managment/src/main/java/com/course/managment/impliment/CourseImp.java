package com.course.managment.impliment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.course.managment.datareop.CourseRepo;
import com.course.managment.interfaces.CourseInterface;
import com.course.managment.model.Courses;

@Component
public class CourseImp implements CourseInterface {

	@Autowired
	CourseRepo repo;
	private HashMap<String, List<Courses>> temp;

	public CourseImp() {
		// TODO Auto-generated constructor stub
		temp = new HashMap<String, List<Courses>>();
	}

	public List<Courses> getAllCourse(String id) {

		return repo.getRefCourse().get(id);
	}

	public void addCourse(String id, Courses course) {
		if (!temp.containsKey(id)) {
			System.out.print("New BOY");
			List<Courses> te = new ArrayList<Courses>();
			te.add(course);
			temp.put(id, te);
		} else {
			temp.get(id).add(course);
		}

		repo.setRefCourse(temp);
	}

}
