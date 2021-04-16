package JavaBase_2_2;

import java.util.Calendar;


public class Student {
	private String name;
	private String code;
	private int birth;
	
	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	public int getBirth() {return birth;}
	public void setBirth(int birth) {this.birth = birth;}
	
	//GetAge
	public int getAge() {
		int age = 0;
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR)- birth;
		return age;
	}
	
	//ShowInfo
	public void showInfo() {
		System.out.println(this.getName());
		System.out.println(this.getBirth());
		System.out.println(this.getCode());
		System.out.println(this.getAge());
	}
	
}
