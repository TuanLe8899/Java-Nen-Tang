package buoi6;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// Nhận 1 mảng số nguyên từ bàn phím: 1 9 2 3 0
			// Mảng chưa được sắp xếp, bạn có muốn sắp xếp mảng không? (Y/N)
				// N - thoát in ra mảng
				// Y - Bạn muốn sắp xếp mảng theo thứ tự tăng dần hay giảm dần (1/0)
					// 1 - in ra mảng
					// 0 - in ra mảng
			// Mảng được sắp xếp theo thứ tự tăng dần
			// Mảng được sắp xếp theo thứ tự giảm dần
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bạn muốn nhập 1 mảng số nguyên có bao nhiêu phần tử: ");
//		int numIndex = sc.nextInt();
//		sc.nextLine();
//		
//		int[] arrInt = new int[numIndex];
//		
//		for (int i = 0; i < numIndex; i++) {
//			System.out.println("Nhập vào phần tử thứ "+(i+1)+":");
//			int index = sc.nextInt();
//			arrInt[i]=index;
//		}
		
		System.out.println("Mảng chưa được sắp xếp, bạn có muốn sắp xếp mảng không? (Y/N)");
		
		boolean check;
		
		do {
			String decision = sc.nextLine();
			switch (decision) {
				case "N":
					System.exit(0);
				case "Y":
					
					break;
				default:
					System.out.println("Vui lòng nhập vào Y hoặc N!");
					check = true;
					break;
			}
		}while(check = true);
		
		
	}

}
