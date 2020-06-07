package com.course.managment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.course.managment.model.Courses;
import com.course.managment.model.Student;
import com.course.managment.model.Studentlogin;
import com.course.managment.service.StudentService;

@Controller
public class LoginController {

	@Autowired
	private StudentService service;

	@RequestMapping(value = "/registerStudent")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/studentDetail", method = RequestMethod.POST)
	public String showDetail(Student student, ModelMap map) {
		service.addStudent(student);
		map.addAttribute("name", service.getStudentDetail(student.getRegNumber()).getfName());
		return "login";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String home(Studentlogin login, ModelMap map) {
		if (service.login(login).equals(service.getStudentDetail(login.getRegNumber()).getfName())) {
			map.addAttribute("message", service.login(login).toString());
			map.addAttribute("reg", login.getRegNumber());
			return "Studenthome";
		} else {
			map.addAttribute("err", service.login(login).toString());

			return "login";
		}

	}

}
