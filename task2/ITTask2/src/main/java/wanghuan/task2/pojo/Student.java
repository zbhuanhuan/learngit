package wanghuan.task2.pojo;

public class Student {
	private int id;
	private String name;
	private String qq;
	private String study_type;
	private long study_date;
	private String college;
	private String online_code;
	private String report_url;
	private String wish;
	private String introducer;
	private long create_at;
	private long update_at;
	
	
	public Student() {
	}
	public Student(int id, String name, String qq, String study_type, long study_date, String college,
			String online_code, String report_url, String wish, String introducer, long create_at, long update_at) {
		this.id = id;
		this.name = name;
		this.qq = qq;
		this.study_type = study_type;
		this.study_date = study_date;
		this.college = college;
		this.online_code = online_code;
		this.report_url = report_url;
		this.wish = wish;
		this.introducer = introducer;
		this.create_at = create_at;
		this.update_at = update_at;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", study_type=" + study_type + ", study_date="
				+ study_date + ", college=" + college + ", online_code=" + online_code + ", report_url=" + report_url
				+ ", wish=" + wish + ", introducer=" + introducer + ", create_at=" + create_at + ", update_at="
				+ update_at + "]";
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
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getStudy_type() {
		return study_type;
	}
	public void setStudy_type(String study_type) {
		this.study_type = study_type;
	}
	public long getStudy_date() {
		return study_date;
	}
	public void setStudy_date(long study_date) {
		this.study_date = study_date;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getOnline_code() {
		return online_code;
	}
	public void setOnline_code(String online_code) {
		this.online_code = online_code;
	}
	public String getReport_url() {
		return report_url;
	}
	public void setReport_url(String report_url) {
		this.report_url = report_url;
	}
	public String getWish() {
		return wish;
	}
	public void setWish(String wish) {
		this.wish = wish;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	public long getCreate_at() {
		return create_at;
	}
	public void setCreate_at(long create_at) {
		this.create_at = create_at;
	}
	public long getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(long update_at) {
		this.update_at = update_at;
	}
	
	
}
