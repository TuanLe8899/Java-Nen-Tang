package JavaBase_1_6;

import java.util.Scanner;

public class NextVsNextLineScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input name here:");
		String name = sc.nextLine();
		System.out.println("This name is : "+ name);
	}
}
