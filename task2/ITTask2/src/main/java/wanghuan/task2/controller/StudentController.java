package wanghuan.task2.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sun.org.glassfish.gmbal.ParameterNames;

import wanghuan.task2.mapper.StudentMapper;
import wanghuan.task2.pojo.Student;
import wanghuan.task2.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Resource
	private StudentServiceImpl studentServiceImpl;
	//查询学生信息
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public @ResponseBody Student findStudentById(ModelAndView model,@PathVariable int id){
		Student student = studentServiceImpl.findStudentById(id);
		model.addObject("student",student);
		model.setViewName("showStudent");
		
		return student;
		
	}
	//添加学生
	@RequestMapping(value = "/add",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody int addStudent(@RequestBody Student student){
		int i = studentServiceImpl.addStudent(student);
		//有错误
		return  i;
		
	}
	//删除学生
	@RequestMapping(value = "/delete/{id}")
	public  ModelAndView deleteStudent(@PathVariable int id,ModelAndView model){
		boolean b = studentServiceImpl.deleteStudentById(id);
		model.addObject("delete",b);
		model.setViewName("showStudent");
		return model;
	}
	//更新学生
	@RequestMapping(value="/update")
	public ModelAndView updateStudent(@RequestBody Student student,ModelAndView model){
		boolean b = studentServiceImpl.updateStudent(student);
		model.addObject("update",b);
		model.setViewName("showStudent");
		return model;
	}
	
	
}
