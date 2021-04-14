package buoi3;

import java.util.Scanner;

public class ShapeNumberZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*					DOC 	NGANG	
		 					7		7
		 1 2 3 4 5 6 7				full
		   2						2
		 	 3						3
		 	   4					4
		  		 5					5
		 		   6				6
		 1 2 3 4 5 6 7				full
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chiều cao của tháp: ");
		int height = sc.nextInt();
		
		System.out.println("------------------------");
		int dieukien = 1;
		for (int doc = 1; doc <= height; doc++) {
			for (int ngang = 1; ngang <= height; ngang++) {
				if(doc > 1 && doc < height && ngang != dieukien)
				{
					System.out.print("  ");
				}
				else
				System.out.print(ngang+" ");
			}
			System.out.println("");
			dieukien++;
		}
	}

}
