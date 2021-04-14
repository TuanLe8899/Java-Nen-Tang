package buoi4;

import java.util.Arrays;

public class CountStringInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrString[] 	= { "Zend 2", "PHP", "Java", "Javascript"};
		int length = arrString.length;
		
		int arrNumString[] = new int[length];
		
		for (int i = 0; i < length; i++) {
			arrNumString[i] = arrString[i].length();
		}
		System.out.println("Output "+ Arrays.toString(arrNumString));
		// [6, 3, 4, 10]
		
		//Tham khảo
		/*
		 * int countElement=0; for(String n: arrString) {
		 * System.out.println("Phần tử thứ "+countElement+" có "+n.replace(" ",
		 * "").length()+" kí tự"); countElement++; }
		 */
	}

}
