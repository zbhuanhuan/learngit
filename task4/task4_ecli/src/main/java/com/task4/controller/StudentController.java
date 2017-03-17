package com.task4.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.task4.pojo.Student;
import com.task4.service.impl.StudentServiceImpl;

@Controller
public class StudentController {
	@Resource
	private StudentServiceImpl studentService;
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String findGoodStudent(Model model){
		List<Student> studentList = studentService.findGoodStudent();
		model.addAttribute("studentList", studentList);
		return "home";
	}
	
	/*@RequestMapping(value="/occupation")
	public String toOccupation(){
		
		return "occupation";
		
	}*/
	

}
