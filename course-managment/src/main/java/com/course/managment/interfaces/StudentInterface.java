package com.course.managment.interfaces;

import java.util.List;

import com.course.managment.model.Student;
import com.course.managment.model.Studentlogin;

public interface StudentInterface {
		
	List<Student> addStudent(Student student);
	Student getStudent(String id);
	Student loginStudent(Studentlogin login);
	boolean studentExist(String id);
}
