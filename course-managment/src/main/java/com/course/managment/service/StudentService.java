package com.course.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.managment.impliment.StudentImp;
import com.course.managment.model.Student;
import com.course.managment.model.Studentlogin;

@Service
public class StudentService {

	@Autowired
	StudentImp studentImp;

	public void addStudent(Student student) {
		studentImp.addStudent(student);
	}

	public Student getStudentDetail(String id) {
		return studentImp.getStudent(id);
	}

	public String login(Studentlogin login) {

		if (studentImp.loginStudent(login) != null) {
			return studentImp.loginStudent(login).getfName();
		} else {
			return "Password or Username does not exixt";
		}

	}

//public static void main(String args[]) {
//	ApplicationContext sampleCls=new ClassPathXmlApplicationContext("config.xml");	StudentImp sa = (StudentImp)sampleCls.getBean("studentImp");
//	
//		//Student sa=new  Student(regNumber, fName, lName, mobileNumber, password)
//		sa.addStudent(new Student("18MCA0232","Shivam","Joshi","8968719311","kakabali"));
//		
//		//StudentImp sa1 = (StudentImp)sampleCls.getBean("studentImp");
//		
//		sa.addStudent(new Student("18MCA0231","Shivam","Joshi","8968719311","kakabali"));
//		
//	sa.display();
//		
//		
//	}

}
