package JavaBase_2_3;

import java.util.Calendar;
import java.sql.Date;;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Tuan");
		student.setBirth(1999);
		//student.setCode("ST01");
		//student.setCode();
		student.setCode(001); //sẽ thành SV1 vì 001 chuyển thành 1
		
		student.showInfo();
		
		//Test Calender class
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
	}

}
