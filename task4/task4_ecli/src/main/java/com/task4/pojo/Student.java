package com.task4.pojo;

public class Student {
	int id;
	String name;
	String introduction;
	int good;
	String type;

	public Student() {
	}
	public Student(int id, String name, String introduction, int good, String type) {
		this.id = id;
		this.name = name;
		this.introduction = introduction;
		this.good = good;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
