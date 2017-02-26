package wanghuan.test;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wanghuan.task2.mapper.StudentMapper;
import wanghuan.task2.pojo.Student;

/**
 * 测试类用ClassPathXmlApplicationContext加载配置文件是只有mybatis的情况下，进行测试的。
 * 如果spring和mybatis结合，则可以用注解进行加载配置文件
 * @author wanghuan
 *
 */
public class testStudentMapper {
	
	ApplicationContext ac = null;

	@Before
	public  void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
	}

	@Test
	public void testFindStudentById() {
		/**
		 * 这个错误必须记录：getBean()里面的为定义的xxxMapper.xml，还需要注意的是首字母小写。tm的，一顿好找。
		 * ApplicationContext.xml文件下有  MapperScannerConfigure的bean，可以扫描mapper，但是需要首字母小写。
		 */
		StudentMapper studentMapper = (StudentMapper) ac.getBean("studentMapper");
		Student student = studentMapper.findStudentById(10);
		System.out.println(student);
	}

}
