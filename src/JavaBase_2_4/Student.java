package JavaBase_2_4;

import java.util.Calendar;


public class Student {
	private String name;
	private String code;
	private int birth;
	
	//constructor
	public Student() {
		super();
	}
	
	public Student(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public Student(String name, String code, int birth) {
		super();
		this.name = name;
		this.code = code;
		this.birth = birth;
	}

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

	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}
	public int getBirth() {return birth;}
	public void setBirth(int birth) {this.birth = birth;}
	

	
}
