package JavaBase_1_8;

public class Shape05 {
	
	public static void main(String[] args) {
		/*
		1
		12
		123
		1234
		12345
		 */
		
		for(int number = 1; number <= 5; number++)
		{
			for(int i = 1; i <= number;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
}
