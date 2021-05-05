package buoi8;

public class TestString {

	public static void main(String[] args) {
		String str 		= "php/12/typescript/192/jquery/190/angular/220";
		String[] arrStr = str.split("/");
		
		int length 		= arrStr.length;
		int[] arrInt 	= new int[length/2];
		String[] arrName = new String[length/2];
		
		int indexInt 	= 0;
		int indexName 	= 0;
		int indexFind 	= 0;
		int max 		= 0;
		
		for (int i = 0; i < length; i++) {
			if(i%2 == 0) {
				arrName[indexName] 	= arrStr[i];
				indexName++;
			} else {
				int time 			= Integer.parseInt(arrStr[i]);
				arrInt[indexInt] 	= time;
				max 				= (time > max) ? time : max;
				indexInt++;
			}
		}
		
		for (int i = 0; i < indexInt; i++) {
			if(arrInt[i] == max) {
				indexFind = i;
				break;
			}
		}
		
		System.out.printf("Buổi học có thời lượng lớn nhất là: %s - %d",arrName[indexFind],max);

	}

}
