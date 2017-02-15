package wanghuan.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import wanghuan.mybatis.dao.IStudentDao;
import wanghuan.mybatis.pojo.Student;

public class studentDaoImpl implements IStudentDao {
	private SqlSessionFactory sqlSessionFactory;
	public studentDaoImpl(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	//
	public Student findStudentById(int id) {
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 Student student = sqlSession.selectOne("test.findStudentById",id);
		 sqlSession.close();
		 return student;
	}
	//增加学生
	public void addStudent(Student student) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("test.addStudent", student);
		sqlSession.commit();
		sqlSession.close();
		
	}

	public int deleteStudentById(int id) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int student = sqlSession.delete("test.deleteStudent", id);
		sqlSession.commit();
		sqlSession.close();
		return student;
	}

	public void updateStudent(Student student) {
		
	}
	//模糊查询学生信息
	public List<Student> findStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
