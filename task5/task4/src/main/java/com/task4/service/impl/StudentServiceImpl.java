package com.task4.service.impl;

import com.task4.mapper.StudentMapper;
import com.task4.pojo.Student;
import com.task4.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2017/3/12.
 */

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;
    public List<Student> findGoodStudent() {
        return  studentMapper.findGoodStudent();
    }

}
