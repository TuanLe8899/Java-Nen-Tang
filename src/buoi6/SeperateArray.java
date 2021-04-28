package buoi6;

import java.util.Arrays;

public class SeperateArray {

	public static void main(String[] args) {
		
		int[] arrInt	= {1, 2, 4, 8, 0, 4, 2, 3, 5, 1};
		
		int length 		= arrInt.length;
		int[] arrChan 	= new int[length];
		int[] arrLe 	= new int[length];
		
		int indexEven	= 0;
		int indexOdd	= 0;
		
		for (int n : arrInt) {
			if(n%2 == 0) {
				arrChan[indexEven]	=n;
				indexEven++;
			}else {
				arrLe[indexOdd]		=n;
				indexOdd++;
			}
		}
		
		arrChan	= Arrays.copyOf(arrChan, indexEven);
		arrLe	= Arrays.copyOf(arrLe, indexOdd);
		
		System.out.println("Input: "+Arrays.toString(arrInt));
		System.out.println("ArrEven: "+Arrays.toString(arrChan));
		System.out.println("ArrOdd: "+Arrays.toString(arrLe));
	}

}
