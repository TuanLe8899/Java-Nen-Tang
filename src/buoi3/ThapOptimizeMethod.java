package buoi3;

import java.util.Scanner;

public class ThapOptimizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Người dùng nhập vào số 4, in ra cái tháp 
		
		Scanner sc = new Scanner(System.in);
		
		//Nhập vào chiều cao của tháp
		System.out.println("Nhập vào độ cao của tháp: ");
		int height = sc.nextInt();
		
		//Kiểm tra số vừa nhập có nhỏ hơn 9 không
		if(height <= 9)
		{
			//độ dài chiều dọc của tháp
			System.out.println("--------------");
			for (int doc = height ; doc >= 1; doc--) {
				char character = (doc%2 == 0) ?	'+' : '*';
				printCharacterOnLine(doc, character);
				System.out.println("");
			}
		} 
		else 
		{
			System.out.println("vui lòng nhập vào 1 số nhỏ hơn 9!");
		}
		// TODO Auto-generated method stub
	}
	
	public static void myPrint(String content) {
		System.out.println(content);
	}
	
	public static void printCharacterOnLine(int length, char character) {
		for (int i = 1; i <= length; i++) {
			System.out.print(character);
		}
	}

}
