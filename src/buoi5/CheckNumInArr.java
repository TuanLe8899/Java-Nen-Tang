package buoi5;

public class CheckNumInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt	= {0, 4, 0, 4, 4};
		int number 		= 8;
		String result="không có 2 phần tử nào cộng lại chia hết cho số đã cho";
		
//		for (int n: arrInt) {
//			if (n==number)	{
//				result="Có tồn tại";
//				break;
//			} else {			
//				result="Không tồn tại";
//			}
//		}
		
		int arrLength = arrInt.length-1;
		for(int i = 0; i < arrLength; i++) {
			if(arrInt[i]+arrInt[i+1] % number == 0)
			{
				result = "có 2 phần tử liên tiếp cộng lại chia hết cho số đã cho";
				break;
			}
		}
		System.out.println(result);
	}
}
