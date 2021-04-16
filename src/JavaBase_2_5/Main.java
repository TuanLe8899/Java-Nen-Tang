package JavaBase_2_5;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		
		Student student1 = new Student();
		student1.setName("Tuan");
		student1.setBirth(1999);
		student1.setCode("002");
		student1.setScore(9.5);
		student1.showInfo();
		
		System.out.println("==============");
		Teacher teacher1 = new Teacher();
		teacher1.setSalary(100000000);
		System.out.println(formatter.format(teacher1.getSalary()));
	}

}
