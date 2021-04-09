package buoi2;

import java.util.Scanner;

public class AVGnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		//Nhap vao so luong so
		System.out.println("Nhap vao bao nhieu so? Nhap vao day: ");
		int clientNumber = sc.nextInt();
		
		//Khoi tao tong cac so = 0
		int clientSumNum = 0;
		
		//Duyet vong lap
		for(int i=1; i<=clientNumber; i++)
		{
			System.out.println("Nhap vao so thu " + i);
			clientSumNum += sc.nextInt();
		}
		
		//Trung binh cong cac so vua nhap
		float AVGnum = (float)clientSumNum/clientNumber;
		
		//In ket qua
		System.out.println("Trung binh cong cua cac so vua nhap la: " + AVGnum);
		
	}

}
