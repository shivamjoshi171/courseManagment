package com.course.managment.impliment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.course.managment.datareop.StudentRepo;
import com.course.managment.interfaces.StudentInterface;
import com.course.managment.model.Student;
import com.course.managment.model.Studentlogin;

@Component
public class StudentImp implements StudentInterface {

	@Autowired
	StudentRepo studentRepo;
	private HashMap<String, Student> temp;

	public StudentImp() {
		
		this.temp = new HashMap<String, Student>();
			}

	public List<Student> addStudent(Student student) {
		// TODO Auto-generated method stu
		temp.put(student.getRegNumber(), student);
		studentRepo.setStudentData(temp);
		// System.out.println(temp.get(0).getlName());
		System.out.println(studentRepo);

		return null;
	}

	public Student getStudent(String id) {

		return studentRepo.getStudentData().get(id);
	}

	public Student loginStudent(Studentlogin login) {
		System.out.println("here");
		Student temp = null;
		if (studentExist(login.getRegNumber())) {
			temp = studentRepo.getStudentData().get(login.getRegNumber());
			return temp;
		} else
			return temp;

	}

	public boolean studentExist(String id) {
		if (studentRepo.getStudentData().containsKey(id))
			return true;
		else
			return false;
	}

}
