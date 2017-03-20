package com.task4.mapper;

import com.task4.pojo.Profession;

import java.util.List;

public interface ProfessionMapper {
    //查询单个Occupation
    Profession selectOccupationDetails(int id);
    //查询多个Occupation
    List<Profession> selectAllOccupationDetails();


    Profession selectProfessionById(int id);

    List<Profession> selectAllProfessions();
}
