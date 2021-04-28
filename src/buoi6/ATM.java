package buoi6;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ATM {

	static int money = 0; //global variable 
		
	public static void main(String[] args) {
		
		final int FIVE_HUNDRED_THOUSAND			= 500000;
		final int Total_FIVE_HUNDRED_THOUSAND 	= 2;
		
		final int TWO_HUNDRED_THOUSAND			= 200000;
		final int Total_TWO_HUNDRED_THOUSAND	= 2;
		
		final int ONE_HUNDRED_THOUSAND			= 100000;
		final int FIFTY_THOUSAND				= 50000;
		final int TWO_THOUSAND					= 20000;
		final int TEN_THOUSAND					= 10000;
		
		int fiveHundredThousand	= 0;
		int twoHundredThousand	= 0;
		int oneHundredThousand	= 0;
		int	fiftyThousand		= 0;
		int twoThousand			= 0;
		int tenThousand			= 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Input your money: ");
			money	= sc.nextInt();
		} while(money % 10000 != 0);
		sc.close();
		
		System.out.println("----------------------------");
		
		// 500.000
		limitMoney(fiveHundredThousand,FIVE_HUNDRED_THOUSAND,Total_FIVE_HUNDRED_THOUSAND);
		
		// 200.000
		limitMoney(twoHundredThousand,TWO_HUNDRED_THOUSAND,Total_TWO_HUNDRED_THOUSAND);
		
		// 100.000
		limitMoney(oneHundredThousand, ONE_HUNDRED_THOUSAND, 0);
		
		// 50.000
		limitMoney(fiftyThousand, FIFTY_THOUSAND, 0);
		
		// 20.000
		limitMoney(twoThousand, TWO_THOUSAND, 0);
		
		// 10.000
		limitMoney(tenThousand ,TEN_THOUSAND, 0);
		
	}
	
	// HÀM TỜ TIỀN VÔ HẠN (CÁC TỜ TIỀN CÒN LẠI)
//	public static void toTien(int typeMoney ,int finalTypeMoney) {
//		DecimalFormat formatter	= new DecimalFormat("#,###");
//		if(money >= finalTypeMoney){
//			typeMoney	= money / finalTypeMoney;
//			money		= money % finalTypeMoney;
//			System.out.printf("Mệnh giá %s: %d tờ %n", formatter.format(finalTypeMoney), typeMoney);	
//		}
//	}
	
	//HÀM TỜ TIỀN GIỚI HẠN (500K VÀ 200K)
	public static void limitMoney(int countTypeMoney ,int typeMoney, int totalMoney ) {
		DecimalFormat formatter	= new DecimalFormat("#,###");
		if(money >= typeMoney) {
			//cach1
//			countTypeMoney	= money / typeMoney;
//			if (totalMoney !=0 && countTypeMoney >= totalMoney) {
//				countTypeMoney = totalMoney;	
//			}
			
			//cach2
			countTypeMoney = totalMoney !=0 && money >= (totalMoney*typeMoney) ? 
					totalMoney : money / typeMoney ;
			
			money = money - typeMoney*countTypeMoney;
			System.out.printf("Mệnh giá %s: %d tờ %n", formatter.format(typeMoney), countTypeMoney);
		
		}
	}

}
