package com.task4.mapper;

import com.task4.pojo.User;

public interface UserMapper {
    User findUserById(String name);

    void addUser(String name,String  password);
}
