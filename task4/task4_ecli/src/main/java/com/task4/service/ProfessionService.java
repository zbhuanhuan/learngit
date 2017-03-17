package com.task4.service;

import java.util.List;

import com.task4.pojo.Occupation;
import com.task4.pojo.Profession;

public interface ProfessionService {
	//查询单个Occupation
	public Profession selectOccupationDetails(int id);
	//查询多个Occupation
	public List<Profession> selectAllOccupationDetails();
	
	
	public Profession selectProfessionById(int id);
	
	public List<Profession> selectAllProfessions();
}
