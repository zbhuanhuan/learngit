package com.task4.controller;

import com.task4.pojo.*;
import com.task4.service.impl.ProfessionServiceImpl;
import com.task4.service.impl.StudentServiceImpl;
import com.task4.service.impl.UserServiceImpl;
import com.task4.utils.DESUtil;
import com.task4.utils.MD5Util;
import org.apache.commons.net.util.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;
    @Resource
    private StudentServiceImpl studentServiceImpl;
    @Resource
    private ProfessionServiceImpl professionServiceImpl;



    //进入主页
    @RequestMapping(value = "/home")
    public String toHome(Model model){
        List<Student> studentList =  studentServiceImpl.findGoodStudent();
        model.addAttribute("studentList",studentList);
        return "home";
    }
    //进入职业界面（需要验证登录）
    @RequestMapping(value = "/profession")
    public String toProfession(Model model){
        List<Profession> professionList = null;
        try {
            professionList = professionServiceImpl.selectAllOccupationDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Occupation> occupationList = null;
        List<Salaries> salariesList = null;
        for(Profession p : professionList){
            occupationList = p.getOccupationList();
            model.addAttribute("occupationList", occupationList);
            for(Occupation o : occupationList){
                salariesList = o.getSalaries();
                model.addAttribute("salariesList",salariesList);
            }
        }
        model.addAttribute("professionList", professionList);
        return "occupation";
    }

    //进入登录界面
    @RequestMapping({"/login", "/"})
    public String toLogin() {
        return "login";
    }

    //登录处理
    @RequestMapping(value = "/login/in", method = RequestMethod.POST)
    public void loginIn(HttpServletRequest request, HttpServletResponse response,
                          @RequestParam("name") String name, @RequestParam("password") String password) {
        //将得到的密码进行加密（md5加密是不可逆的）
        String md5Pas = MD5Util.stringToMD5(password);
        //验证用户信息 ，如果密码不对，重新返回登录界面
        if ((userServiceImpl.validationUser(name, md5Pas))) {
            User user = null;
            if (name != null && name != "") {
                try {
                    user = userServiceImpl.findUserById(name);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //得到session，并设置User对象
            request.getSession().setAttribute("user", user);
            //将token加密存到token里面
            String token = user.getU_id() + "|" + System.currentTimeMillis();
            //对token加密
            byte[] bytes = DESUtil.encrypt(token.getBytes(), "12345678");
            Cookie cookie = new Cookie("token", Base64.encodeBase64String(bytes));
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);

            try {
                response.sendRedirect("/task4/home");
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            try {
                response.sendRedirect("/task4/login");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    //进入注册界面
    @RequestMapping(value="/register")
    public String toRegister(){

        return "register";
    }

    //注册处理
    @RequestMapping(value = "/register/in")
    public  String register(@RequestParam("name") String name,
                            @RequestParam("password") String password ){
        String md5 = MD5Util.stringToMD5(password);
        try {
            userServiceImpl.registerUser(name,md5);
        } catch (Exception e) {
            System.out.println("出异常了");
            e.printStackTrace();
        }
        return "home";
    }

}
