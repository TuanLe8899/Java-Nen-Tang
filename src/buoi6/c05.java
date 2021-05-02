package buoi6;


import java.util.Arrays;
import java.util.Scanner;

public class c05 {
	
	// Nháº­n 1 máº£ng sá»‘ nguyÃªn tá»« bÃ n phÃ­m: 1 9 2 3 0
	// Máº£ng chÆ°a Ä‘Æ°á»£c sáº¯p xáº¿p, báº¡n cÃ³ muá»‘n sáº¯p xáº¿p máº£ng khÃ´ng? (Y/N)
		// N - thoÃ¡t in ra máº£ng
		// Y - Báº¡n muá»‘n sáº¯p xáº¿p máº£ng theo thá»© tá»± tÄƒng dáº§n hay giáº£m dáº§n (1/0)
			// 1 - in ra máº£ng
			// 0 - in ra máº£ng
	// Máº£ng Ä‘Æ°á»£c sáº¯p xáº¿p theo thá»© tá»± tÄƒng dáº§n
	// Máº£ng Ä‘Æ°á»£c sáº¯p xáº¿p theo thá»© tá»± giáº£m dáº§n
	
	public static void main(String[] args) {
		
		// NHáº­p array tá»« bÃ n phÃ­m
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sá»‘ pháº§n tá»­ cá»§a máº£ng: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Pháº§n tá»­ %d: ", i);
			arr[i] = sc.nextInt();
		}
	
		System.out.println("Input: " + Arrays.toString(arr));
		
		// Kiá»ƒm tra
		int countGreater 	= 0;
		int countLess 		= 0;
		for (int i = 0; i < n - 1; i++) {
			if(arr[i] > arr[i + 1]) countGreater++;
			if(arr[i] < arr[i + 1]) countLess++;
		}
		
		// 1 < 2 < 3 < 4 < 5
		// 5 > 4 > 2 > 1 > 0
		
		if(countGreater == n - 1) {
			System.out.printf("Giáº£m dáº§n");
		} else if(countLess == n - 1) {
			System.out.printf("TÄƒng dáº§n");
		} else {
			System.out.println("Máº£ng chÆ°a sáº¯p xáº¿p, hÃ£y chá»�n kiá»ƒu sáº¯p xáº¿p [1 - TÄƒng dáº§n, 2 - Giáº£m dáº§n]");
			int functionID		= sc.nextInt();
			sc.nextLine();
			
			if (functionID == 1) {
				Arrays.sort(arr);
			}else {
				// Giáº£m dáº§n 
				int length	= arr.length;
				for(int i = 0; i < length/2; i++){
					int elmTmp	= arr[i];
					arr[i]	= arr[length - 1 - i];
					arr[length - 1 - i]	= elmTmp;
				} 
			}
			System.out.println("Output: " + Arrays.toString(arr));
		}
		sc.close();
	}	
}
