package wanghuan.task2.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import wanghuan.task2.mapper.StudentMapper;
import wanghuan.task2.pojo.Student;
import wanghuan.task2.service.StudentService;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {
	
	@Resource
	private StudentMapper studentMapper;
	//查询学生信息
	public Student findStudentById(int id) {
		Student student = studentMapper.findStudentById(id);
		return student;
	}
	//增加学生
	public int addStudent(Student student) {
		int i=0;
		try {
			i = studentMapper.addStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	//删除学生
	public boolean deleteStudentById(int id) {
		int i = studentMapper.deleteStudentById(id);
		if(i > 0){
			return true;
		}
		return false;
	}
	//更新学生信息
	public boolean updateStudent(Student student) {
		int i = studentMapper.updateStudent(student);
		if(i > 0){
			return true;
		}
		return false;
	}

	public void addStudentBatch(List<Student> students) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> findStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
