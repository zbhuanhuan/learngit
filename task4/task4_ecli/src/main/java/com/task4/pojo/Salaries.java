package com.task4.pojo;

public class Salaries {
	int s_id;
	int type_id;
	String type_name;
	String years;
	String salary;
	
	public Salaries() {
	}
	public Salaries(int s_id, int type_id, String type_name, String years, String salary) {
		this.s_id = s_id;
		this.type_id = type_id;
		this.type_name = type_name;
		this.years = years;
		this.salary = salary;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
}
