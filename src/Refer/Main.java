package Refer;
import java.lang.Enum;

enum HoliDay {
	  WESTERN_NEW_YEAR(1,1),
	  CHRISTMAS(25, 12);

	  private final int day;

	  private final int month;

	  public int getDay() {
	    return day;
	  }

	  public int getMonth() {
	    return month;
	  }

	  HoliDay(int day, int month) {
	    this.day = day;
	    this.month = month;
	  }
	}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HoliDay.CHRISTMAS.getDay());
		System.out.println(HoliDay.CHRISTMAS.getMonth());
		System.out.println(HoliDay.WESTERN_NEW_YEAR.getDay());
		System.out.println(HoliDay.WESTERN_NEW_YEAR.getMonth());
	}

}
