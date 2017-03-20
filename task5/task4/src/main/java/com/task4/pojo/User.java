package com.task4.pojo;

public class User {
	private int u_id;
	private String u_name;
	private String u_account;
	private String u_password;
	
	public User() {
	}
	public User(int u_id, String u_name, String u_account, String u_password) {
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_account = u_account;
		this.u_password = u_password;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	
}
