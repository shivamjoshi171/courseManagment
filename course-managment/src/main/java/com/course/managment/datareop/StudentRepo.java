package com.course.managment.datareop;


import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.course.managment.model.Student;
@Component

public  class  StudentRepo {
		
	private HashMap<String,Student> studentData;
	
	
	

	public HashMap<String, Student> getStudentData() {
		return studentData;
	}

	public void setStudentData(HashMap<String, Student> studentData) {
		this.studentData = studentData;
	}

	
	
}
