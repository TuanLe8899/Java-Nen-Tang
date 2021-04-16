package JavaBase_2_3;

public class Student {
	private String name;
	private String code;
	private int birth;
	
	//get set
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getCode() {return code;}
	public int getBirth() {return birth;}
	public void setBirth(int birth) {this.birth = birth;}
	
	public void setCode(String code) {this.code = code;}
	//Overloading Method
	public void setCode(int number) {this.code = "SV"+number;} //Không đúng vì 001 sẽ thành 1
	public void setCode() {this.code = "SV000";}
	
	

	public void showInfo() {
		System.out.println(this.getName());
		System.out.println(this.getBirth());
		System.out.println(this.getCode());
	}
	
}
