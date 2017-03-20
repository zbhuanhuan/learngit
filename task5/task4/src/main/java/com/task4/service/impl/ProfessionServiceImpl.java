package com.task4.service.impl;

import com.task4.mapper.ProfessionMapper;
import com.task4.pojo.Profession;
import com.task4.service.ProfessionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2017/3/18.
 */
@Service
public class ProfessionServiceImpl implements ProfessionService{
    @Resource
    private ProfessionMapper professionMapper;
    public Profession selectOccupationDetails(int id) {
        return professionMapper.selectOccupationDetails(id);
    }

    public List<Profession> selectAllOccupationDetails() {
        return professionMapper.selectAllOccupationDetails();
    }


    public Profession selectProfessionById(int id) {
        return professionMapper.selectProfessionById(id);
    }
    //查询所有职业
    public List<Profession> selectAllProfessions() {
        return professionMapper.selectAllProfessions();
    }

}
