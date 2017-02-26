package wanghuan.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wanghuan.task2.pojo.Student;
import wanghuan.task2.service.impl.StudentServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/ApplicationContext.xml"})
public class testStudentMapperWithSpring {
	
	@Resource
	private StudentServiceImpl studentServiceImpl = null;
	
	@Test
	public void test() {
		Student student = studentServiceImpl.findStudentById(10);
		System.out.println(student);
	}

}
