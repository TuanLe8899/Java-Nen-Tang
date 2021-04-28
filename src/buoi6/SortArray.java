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
		
		//Nhập số phần tử
		int numIndex = sc.nextInt();
		sc.nextLine();
		
		//Khởi tạo mảng với số phần tử vừa nhập
		int[] arrInt = new int[numIndex];
		
		//Tiến hành thêm các phần tử nhập từ bàn phím vào mảng
		for (int i = 0; i < numIndex; i++) {
			System.out.println("Nhập vào phần tử thứ "+(i+1)+":");
			int index = sc.nextInt();
			sc.nextLine();
			arrInt[i]=index;
		}
		
		//Tạo menu cho người dùng
		System.out.println("Mảng chưa được sắp xếp, bạn có muốn sắp xếp mảng không? (Y/N)");
		//select Y/N
		String decision = sc.nextLine();

		//menu1
		switch (decision) {
			case "N":
				System.exit(0);
				
			case "Y":
				System.out.println("Bạn muốn sắp xếp mảng theo thứ tự tăng dần hay giảm dần? (1/0)");
				//select 1,0
				int choose = sc.nextInt();
				sc.nextLine();
				
				//menu2
				switch (choose) {
					case 1:
						System.out.println("Mảng tăng dần: ");
						Arrays.sort(arrInt);
						System.out.println(Arrays.toString(arrInt));
						break;
						
					case 0:
						System.out.println("Mảng giảm dần: ");
						Arrays.sort(arrInt);
						for (int i = 0; i < numIndex/2; i++) {
							int elmTmp 				= arrInt[i];
							arrInt[i] 				= arrInt[numIndex-1-i];
							arrInt[numIndex-1-i]	= elmTmp;
						}
						System.out.println(Arrays.toString(arrInt));
						break;
				}
				break;
		}
		sc.close();
	}
}
