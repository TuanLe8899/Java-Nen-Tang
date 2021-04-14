package buoi4;

public class SumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt = {1,2,5,8,3};
		int sumEven = 0;
		int sumOdd  = 0;
		int sumAll	= 0;
		
		//Cách 1
		for(int n : arrInt)
		{
			if(n % 2 == 0) sumEven+=n;
			else sumOdd+=n;
			sumAll+=n;
		}
		System.out.println("Tổng các phần tử chẵn: "+sumEven);
		System.out.println("Tổng các phần tử lẻ: "+sumOdd);
		System.out.println("Tổng các phần tử: "+sumAll);
		
		//Cách 2
		/*
		 * for(int n : arrInt) { if(n % 2 == 0) sumEven+=n; else sumOdd+=n; }
		 * System.out.println("Tổng các phần tử chẵn: "+sumEven);
		 * System.out.println("Tổng các phần tử lẻ: "+sumOdd);
		 * System.out.println("Tổng các phần tử: "+(sumEven+sumOdd));
		 */
	
	
	
	}

}
