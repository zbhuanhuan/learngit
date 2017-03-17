package com.task4.mapper;

import java.util.List;

import com.task4.pojo.Occupation;
import com.task4.pojo.Profession;

public interface ProfessionMapper {
	//查询单个Occupation
	Profession selectOccupationDetails(int id);
	//查询多个Occupation
	List<Profession> selectAllOccupationDetails();
	
	
	Profession selectProfessionById(int id);
	
	List<Profession> selectAllProfessions();
}
