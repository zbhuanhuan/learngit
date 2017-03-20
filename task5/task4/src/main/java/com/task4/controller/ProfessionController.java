package com.task4.controller;

import com.task4.pojo.Occupation;
import com.task4.pojo.Profession;
import com.task4.pojo.Salaries;
import com.task4.service.impl.ProfessionServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
//@RequestMapping(value="/profession")
public class ProfessionController {
    @Resource
    private ProfessionServiceImpl professionServiceImpl;
    //查询单个职业，根据id
    @RequestMapping(value="/list/{id}")
    public String selectProfessionById(Model model,@PathVariable int id){
        Profession profession =  professionServiceImpl.selectProfessionById(id);
        model.addAttribute("profession", profession);
        //System.out.println(profession.getName());
        //System.out.println(professionList);
        return "occupation";
    }
    //查询所有职业
    @RequestMapping(value="/list")
    public String selectAllProfessions(Model model){
        List<Profession> professionList =  professionServiceImpl.selectAllProfessions();
        model.addAttribute("professionList", professionList);
        //System.out.println(profession.getName());
        System.out.println(professionList);
        return "occupation";
    }




    //查询某一个专业相关的信息
    @RequestMapping(value="/occupation/{id}")
    public String selectOccupationDetails(Model model,@PathVariable int id){
        Profession profession = null;
        try {
            profession = professionServiceImpl.selectOccupationDetails(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<Occupation> occupationList = profession.getOccupationList();
		/*for(Occupation o:occupationList){
			List<Salaries> salariesList = o.getSalaries();
			model.addAllAttributes(salariesList);
		}*/
        model.addAttribute("occupationList", occupationList);
        model.addAttribute("profession", profession);
        String name = profession.getName();
        System.out.println(name);
        System.out.println(profession);
        System.out.println(occupationList);
        return "occupation";
    }

    //查询多个Occupation的信息
    @RequestMapping(value="/u/occupation")
    public String selectAlloccupationDetails(Model model){
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
}
