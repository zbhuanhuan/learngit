package com.task4.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.task4.mapper.StudentMapper;
import com.task4.pojo.Student;
import com.task4.service.StudentService;

@Service
public class StudentServiceImpl  implements StudentService{
	@Resource
	private StudentMapper studentMapper;

	@Override
	public List<Student> findGoodStudent() {
		
		return studentMapper.findGoodStudent();
	}

}
