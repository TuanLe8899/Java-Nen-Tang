package buoi2;

import java.util.Scanner;

public class NumVsLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		//Input number
		System.out.println("Nhap vao so: ");
		int clientNumber = sc.nextInt();
		sc.nextLine();
		
		//Input language
		System.out.println("Nhap vao ngon ngu: ");
		String clientLang = sc.nextLine();
		
		//result
		String result;
		
		//Start check
		if(clientLang.equals("en"))
		{
			switch (clientNumber) {
				case 1: result = "Monday";break;
				case 2: result = "Tuesday";break;
				case 3: result = "Wednesday";break;
				case 4: result = "Thursday";break;
				case 5: result = "Friday";break;
				case 6: result = "Saturday";break;
				case 7: result = "Sunday";break;
				default: result = "Vui long nhap vao so tu 1 den 7";
				break;
			}
		} 
		else if(clientLang.equals("vi"))
		{
			switch (clientNumber) {
				case 1: result = "Thu hai";break;
				case 2: result = "Thu ba";break;
				case 3: result = "Thu tu";break;
				case 4: result = "Thu nam";break;
				case 5: result = "Thu sau";break;
				case 6: result = "Thu bay";break;
				case 7: result = "Chu nhat";break;
				default: result = "Vui long nhap vao so tu 1 den 7";
				break;
			}	
		} else result = "vui long nhap vao vi hoac en";
		
		System.out.println(result);
	}

}
