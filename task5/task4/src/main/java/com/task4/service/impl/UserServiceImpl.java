package com.task4.service.impl;

import com.task4.mapper.UserMapper;
import com.task4.pojo.User;
import com.task4.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User findUserById(String name) {
        return userMapper.findUserById(name);
    }

    //验证数据库是否有用户
    public  boolean validationUser(String name,String password){
        User user = userMapper.findUserById(name);
        if(password.equals(user.getU_password())){
            return  true;
        }
        return false;
    }

    //注册用户
    public  void  registerUser(String name,String password){
        userMapper.addUser(name, password);
    }
}
