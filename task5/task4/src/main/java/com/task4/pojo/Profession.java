package com.task4.pojo;

import java.util.List;

public class Profession {
	private int id;
	private String name;
	private List<Occupation> occupationList;
	public Profession() {
	}
	public Profession(int id, String name, List<Occupation> occupationList) {
		this.id = id;
		this.name = name;
		this.occupationList = occupationList;
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
	public List<Occupation> getOccupationList() {
		return occupationList;
	}
	public void setOccupationList(List<Occupation> occupationList) {
		this.occupationList = occupationList;
	}



	
	
}
