package wanghuan.task2.mapper;


import java.util.List;


import wanghuan.task2.pojo.Student;


public interface StudentMapper {
	//根据id查询学生信息
	public Student findStudentById(int id);
	//增加学生
	public int addStudent(Student student);
	//根据id删除学生
	public int deleteStudentById(int id);
	//修改学生信息
	public int updateStudent(Student student);
	//批量增加学生
	public void addStudentBatch(List<Student> students);
	
	//根据姓名模糊查询学生
	public List<Student>  findStudentByName(String name); 
}
