package com.task4.controller;

import com.task4.pojo.Student;
import com.task4.service.impl.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2017/3/12.
 */
@Controller
@RequestMapping(value = "/show")
public class StudentController {
    @Resource
    private StudentServiceImpl studentService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String findGoodStudent(Model model){
        List<Student> studentList =studentService.findGoodStudent();
        model.addAttribute("studentList",studentList);
        for (Student s:studentList
             ) {
            System.out.println(s);

        }
        return "index";
    }

}
