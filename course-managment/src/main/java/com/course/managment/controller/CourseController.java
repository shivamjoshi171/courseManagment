package com.course.managment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.course.managment.model.Courses;
import com.course.managment.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	
	@RequestMapping(value="/addCourse/{reg}",method=RequestMethod.POST)
	public String reg(Courses course ,ModelMap map,@PathVariable("reg") String id) {
		courseService.addCourse(id, course);
		map.addAttribute("courseList",courseService.getRegCourse(id));
		return "regCourses";
	}
	@RequestMapping(value="registered/{reg}")
	public String getAllCourse(@PathVariable("reg") String id,ModelMap map) {
		try {
			map.addAttribute("courseList",courseService.getRegCourse(id));
		}catch(NullPointerException e) {
			map.addAttribute("noreg","No Courses are registered");
		}
		
		
		return "regCourses";
	}
	
}
