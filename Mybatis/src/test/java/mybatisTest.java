import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import wanghuan.mybatis.annotation.StudentAnnotation;
import wanghuan.mybatis.dao.impl.studentDaoImpl;
import wanghuan.mybatis.mapper.StudentMapper;
import wanghuan.mybatis.pojo.Student;

public class mybatisTest extends TestCase {
	private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void  setUp() throws IOException{
		String resource = "mybatis.xml";
        //得到配置文件的流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂SqlSessionFactory,要传入mybaits的配置文件的流
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        
	}
	//@Test
	//public void testFindStudentById(){
	//	studentDaoImpl studentDao = new studentDaoImpl(sqlSessionFactory);
	//	Student student = studentDao.findStudentById(1);
	//	System.out.println(student.toString());
		
	//}
	
	@Test
	public void testFindStudentById(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentAnnotation mapper =  sqlSession.getMapper(StudentAnnotation.class);
		Student student = mapper.findStudentById(2);
		System.out.println(student.toString());
	}
	
	@Test
	public void testaddStudent(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentAnnotation mapper =  sqlSession.getMapper(StudentAnnotation.class);
		Student student = new Student();
		student.setId(4);
		student.setsAge(12);
		student.setsName("张二");
		mapper.addStudent(student);
		sqlSession.commit();
		sqlSession.close();
		System.out.println(student.toString());
	}
	
	@Test
	public void testDeleteStudent(){
		studentDaoImpl studentDao = new studentDaoImpl(sqlSessionFactory);
		int row = studentDao.deleteStudentById(4);
		System.out.println("删除成功"+row);
	}

}
