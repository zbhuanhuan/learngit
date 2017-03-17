package com.task4.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.task4.mapper.ProfessionMapper;
import com.task4.pojo.Occupation;
import com.task4.pojo.Profession;
import com.task4.service.ProfessionService;

@Service
public class ProfessionServiceImpl implements ProfessionService {
	@Resource
	private ProfessionMapper professionMapper;
	//查询单个Occupation
	@Override
	public Profession selectOccupationDetails(int id) {
		return professionMapper.selectOccupationDetails(id);
	}
	//查询多个Occupation
	@Override
	public List<Profession> selectAllOccupationDetails() {
		return professionMapper.selectAllOccupationDetails();
	}
	
	
	@Override
	public Profession selectProfessionById(int id) {
		return professionMapper.selectProfessionById(id);
	}
	//查询所有职业
	@Override
	public List<Profession> selectAllProfessions() {
		return professionMapper.selectAllProfessions();
	}
	

}
