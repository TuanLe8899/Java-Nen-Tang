package buoi3;

import java.util.Scanner;

public class countNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Viết 1 chương trình nhập vào số tự nhiên có số chữ số nhỏ hơn 9
		//tính con số vừa nhập có bao nhiêu chữ số
		//input: num
		//output: count num
		
		Scanner sc =  new Scanner(System.in);
		
		//Nhập vào số
		System.out.println("Nhap vao 1 so co so chu so nho hon 9!");
		int i= sc.nextInt();
		
		//Khởi tạo biến đếm
		int count = 0;
		
		//Dùng vòng lặp chia 10 để đếm
		while(i > 0) {
			i/=10;
			count++;
		}
		System.out.println("so vua nhap co "+count+" chu so");
		sc.close();
	}

}
