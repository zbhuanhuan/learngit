package wanghuan.mybatis.mapper;

import java.util.List;

import wanghuan.mybatis.pojo.Student;

public interface StudentMapper {
	//根据id查询学生信息
	public Student findStudentById(int id);
	//根据姓名模糊查询学生
	public List<Student>  findStudentByName(String name); 
	//增加学生
	public void addStudent(Student student);
	//根据id删除学生
	public int deleteStudentById(int id);
	//修改学生信息
	public void updateStudent(Student student);

}
