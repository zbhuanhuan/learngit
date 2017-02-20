package wanghuan.test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import wanghuan.mybatis.mapper.StudentMapper;
import wanghuan.mybatis.pojo.Student;

public class Mybatis {
	private  SqlSessionFactory sqlSessionFactory;
	//批量加入学生
	public static List<Student> addToList(List<Student> list){
		for(int i = 0;i<2;i++){
			Student student = new Student();
			student.setName("张三"+i);
			list.add(student);
		}
		return list;
	}
	@Before
	public  void setUp() throws Exception {
		String resource = "mybatis.xml";
		//得到配置文件的输入流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//创建会话工厂sqlSessionFactory，并传入配置文件的输入流
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	//测试增加学生信息
	/**
	 * 暂时出现问题，插入数据显示成功，但是从数据库却检测不到
	 * （突然想到了，增删改都需要sqlSession进行commit，这个错误烦了好几次了）
	 */
	@Test
	public void testInsert() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Student student = new Student();
		//student.setId(15);  主键可以不写，有默认的值
		student.setName("小明");
		student.setQq("544168502");
		student.setStudy_type("java工程师");
		student.setStudy_date((long) 20170301);
		student.setCollege("中北大学");
		student.setOnline_code("111");
		student.setReport_url("wwwwwww");
		student.setWish("");
		student.setIntroducer("李莎莎");
		student.setCreate_at(System.currentTimeMillis());
		student.setUpdate_at(System.currentTimeMillis());
		try {
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.addStudent(student);
			System.out.println(student.getId());//返回学生主键(需要在mapper配置文件配置)
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	//心血来潮，突然想起一丁师兄做了一个批量插入
	@Test
	public void testInsertBatch(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Student> students = new ArrayList<Student>();
		Mybatis.addToList(students);
		try {
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.addStudentBatch(students);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	//测试删除学生
	/**
	 * delete执行本身有没有返回结果，
	 * 如果要求删除成功返回true，失败返回false怎么办，测试了一下，delete删除成功返回1，删除失败返回0.
	 */
	@Test
	public void testDelete(){
		Logger logger = Logger.getLogger(Mybatis.class.getName());
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//boolean b = false;
		int b;
		try {
			int i=22;
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			b = mapper.deleteStudentById(i);
			if(b >0){
				logger.info("删除成功");//不能成功输出
			    //System.out.println("删除成功"+ b);
			}else{
				System.out.println("删除失败");
			}

		sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	//测试更新学生信息
	@Test
	public void testUpdate(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		long time = (new Date().getTime());      //new Date().getTime 本身得到就是long类型：
		Student student = new Student();
		student.setId(10);
		student.setCreate_at(time);
		student.setName("王欢");
		try {
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			mapper.updateStudent(student);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	//测试根据id查询学生信息
	@Test
	public void testFindById() throws Exception{
		Logger logger = Logger.getLogger("Myabtis.class");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Student student=null;
		try {
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			student = mapper.findStudentById(22);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.info(student);
		System.out.println(student.getName());
	}
	
	//测试根据name查询学生信息
	/**
	 * 在xxx.mapper.xml中写 LIKE的时候加上  '%',注意在分号后加空格，否则容易出错
	 * @throws Exception
	 */
	@Test
	public void  testFindByName() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Student> students = new ArrayList<Student>();
		String name ="李";
		try {
			StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
			students = mapper.findStudentByName(name);
			for(Student s:students){
				System.out.println(s.getId()+  s.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}

}

