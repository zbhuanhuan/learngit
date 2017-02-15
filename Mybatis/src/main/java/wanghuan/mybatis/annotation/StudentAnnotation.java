package wanghuan.mybatis.annotation;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import wanghuan.mybatis.pojo.Student;

public interface StudentAnnotation {
	@Select("select * from student1 where sid=#{id}")
	public Student findStudentById(@Param("id")int id);
	
	@Insert("insert into student1(sid,s_name,s_age) values(#{id},#{sName},#{sAge})")
	public void addStudent(Student student);
}
