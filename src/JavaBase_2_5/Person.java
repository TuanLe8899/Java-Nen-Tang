package JavaBase_2_5;

import java.util.Calendar;

//Error here
final public class Person {
	private String name;
	private String code;
	private int birth;
	
	//GetAge
	public int getAge() {
		int age = 0;
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR)- birth;
		return age;
	}
	
	//ShowInfo
	public void showInfo() {
		System.out.println("Name student: "+this.getName());
		System.out.println("Student birthday: "+this.getBirth());
		System.out.println("Codestudent: "+this.getCode());
		System.out.println("Age student: "+this.getAge());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	
}
