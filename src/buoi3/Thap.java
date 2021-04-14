package buoi3;

import java.util.Scanner;

public class Thap {

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
				
				//độ dài chiều ngang của tháp
				for (int ngang = 1; ngang <= doc; ngang ++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		} 
		else 
		{
			System.out.println("vui lòng nhập vào 1 số nhỏ hơn 9!");
		}
	}
}



