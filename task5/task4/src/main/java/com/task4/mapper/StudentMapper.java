package com.task4.mapper;

import com.task4.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by admin on 2017/3/12.
 */
@Repository
public interface StudentMapper {
     List<Student> findGoodStudent();
}
