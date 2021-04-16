package JavaBase_2_4;

import java.util.Calendar;
import java.sql.Date;;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Tuan","002",1999);
		//student.setCode("ST01");
		//student.setCode();
		student.showInfo();
		
		//Test Calender class
		/*
		 * Calendar now = Calendar.getInstance(); int year = now.get(Calendar.YEAR);
		 * System.out.println(year);
		 */
		System.out.println("----------------");
		Student student2 = new Student("Chanh", "004");
		student2.setBirth(2000);
		student2.showInfo();
	}

}
