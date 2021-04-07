package buoi2;

import java.util.Scanner;

public class AVGnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao bao nhieu so? Nhap vao day: ");
		int clientNumber = sc.nextInt();
		
		int clientSumNum = 0;
		int dem = 0;
		for(int i=1; i<=clientNumber; i++)
		{
			System.out.println("Nhap vao so thu " + i);
			clientSumNum += sc.nextInt();
			dem ++;
		}
		float AVGnum = (float)(clientSumNum/dem);
		System.out.print("Trung binh cong cua cac so vua nhap la: ");
		System.out.println(AVGnum);
		
	}

}
