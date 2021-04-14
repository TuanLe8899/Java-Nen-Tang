package buoi4;

public class CheckNumInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrInt	= {0, 4, 0, 4, 4};
		int number 		= 5;
		String result="";
		
		for (int n: arrInt) {
			if (n==number)	{
				result="Có tồn tại";
				break;
			} else {			
				result="Không tồn tại";
			}
		}
		System.out.println(result);
	}
}
