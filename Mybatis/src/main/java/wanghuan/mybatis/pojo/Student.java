package wanghuan.mybatis.pojo;

public class Student {
	private int id;
	private String sName;
	private int sAge;
	
	public Student() {
	}
	public Student(int id, String sName, int sAge) {
		this.id = id;
		this.sName = sName;
		this.sAge = sAge;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
}
