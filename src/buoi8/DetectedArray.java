package buoi8;

public class DetectedArray {

	public static void main(String[] args) {
//		Output: OK 
//
//		có tồn tại phần tư
//		có tổng hoặc hiệu 2 phần từ kế tiếp bằng
//		có tổng hoặc hiệu 2 phần tử đầu và cuối bằng
//		có trung bình bằng
		
		int number 		= 5;
		int[] arrOne 	= {1, 2, 12, 6, 4};
		
		int length 		= arrOne.length;
		String check 	= "NO";
		
		if( arrOne[0] + arrOne[length-1] == number || arrOne[0] - arrOne[length-1] == number ) {
			check = "OK";
		} else {
			
			int sumArr 	= 0;
			for(int n : arrOne)
			{
				sumArr += n;
			}
			
			if(sumArr/length == number) {
				check = "OK";
			} else {
				for (int i = 0; i < length; i++) {
					if (arrOne[i] == number) {
						check = "OK";
						break;
					}
					else if(i+1<length && (arrOne[i] + arrOne[i+1] == number || arrOne[i] - arrOne[i+1] == number)) {
						check = "OK";
						break;
					}	
				}
			}
		}
		System.out.println(check);
	}

}
