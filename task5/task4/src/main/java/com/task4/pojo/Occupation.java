package com.task4.pojo;

import java.util.List;

public class Occupation {
	private int id;
	private int t_id;
	private int p_id;
	private String tname;
	private int people_studing;
	private String career_threshold;
	private String difficulty_level;
	private int growth_circle;
	private int wangted_company;
	private String enroll_basis;
	private String t_intro;
	private List<Salaries> salariesList;
	
	public List<Salaries> getSalaries() {
		return salariesList;
	}
	public void setSalaries(List<Salaries> salariesList) {
		this.salariesList = salariesList;
	}
	public Occupation() {
	}
	
	public Occupation(int id, int t_id, int p_id, String tname, int people_studing, String career_threshold,
			String difficulty_level, int growth_circle, int wangted_company, String enroll_basis, String t_intro,
			List<Salaries> salariesList) {
		this.id = id;
		this.t_id = t_id;
		this.p_id = p_id;
		this.tname = tname;
		this.people_studing = people_studing;
		this.career_threshold = career_threshold;
		this.difficulty_level = difficulty_level;
		this.growth_circle = growth_circle;
		this.wangted_company = wangted_company;
		this.enroll_basis = enroll_basis;
		this.t_intro = t_intro;
		this.salariesList = salariesList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getPeople_studing() {
		return people_studing;
	}
	public void setPeople_studing(int people_studing) {
		this.people_studing = people_studing;
	}
	public String getCareer_threshold() {
		return career_threshold;
	}
	public void setCareer_threshold(String career_threshold) {
		this.career_threshold = career_threshold;
	}
	public String getDifficulty_level() {
		return difficulty_level;
	}
	public void setDifficulty_level(String difficulty_level) {
		this.difficulty_level = difficulty_level;
	}
	public int getGrowth_circle() {
		return growth_circle;
	}
	public void setGrowth_circle(int growth_circle) {
		this.growth_circle = growth_circle;
	}
	public int getWangted_company() {
		return wangted_company;
	}
	public void setWangted_company(int wangted_company) {
		this.wangted_company = wangted_company;
	}
	public String getEnroll_basis() {
		return enroll_basis;
	}
	public void setEnroll_basis(String enroll_basis) {
		this.enroll_basis = enroll_basis;
	}
	public String getT_intro() {
		return t_intro;
	}
	public void setT_intro(String t_intro) {
		this.t_intro = t_intro;
	}
	
}
