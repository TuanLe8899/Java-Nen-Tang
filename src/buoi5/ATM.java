package buoi5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat formatter	= new DecimalFormat("#,###");
		
		// Your's money: 450.000
		int money	= 0;
		int newMoney = 0;
		
		final int FIVE_HUNDRED_THOUSAND	= 500000;
		final int TWO_HUNDRED_THOUSAND	= 200000;
		final int ONE_HUNDRED_THOUSAND	= 100000;
		final int FIFTY_THOUSAND		= 50000;
		final int TWEENTY_THOUSAND		= 20000;
		final int TEN_THOUSAND			= 10000;
		
		final int TOTAL_FIVE_HUNDRED_THOUSAND	= 10;
		final int TOTAL_TWO_HUNDRED_THOUSAND	= 10;
		final int TOTAL_ONE_HUNDRED_THOUSAND	= 10;
		final int TOTAL_FIFTY_THOUSAND			= 10;
		final int TOTAL_TWEENTY_THOUSAND		= 10;
		final int TOTAL_TEN_THOUSAND			= 10;
		
		
		int fiveHundredThousand	= 0;
		int twoHundredThousand	= 0;
		int oneHundredThousand	= 0;
		int	fiftyThousand		= 0;
		int tweentyThousand		= 0;
		int tenThousand			= 0;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Your's money: ");
			money	= sc.nextInt();
		}while(money % 10000 != 0);
		sc.close();
		
		System.out.println("-----------------------------");
				
		// 500.000
		printCountNumberMoney(money, FIVE_HUNDRED_THOUSAND, TOTAL_FIVE_HUNDRED_THOUSAND, fiveHundredThousand);
		newMoney = returnValMoney(money, FIVE_HUNDRED_THOUSAND, TOTAL_FIVE_HUNDRED_THOUSAND, fiveHundredThousand);
		
		// 200.000
		printCountNumberMoney(newMoney, TWO_HUNDRED_THOUSAND, TOTAL_TWO_HUNDRED_THOUSAND, twoHundredThousand);
		newMoney = returnValMoney(newMoney, TWO_HUNDRED_THOUSAND, TOTAL_TWO_HUNDRED_THOUSAND, twoHundredThousand);
		
		// 100.000
		printCountNumberMoney(newMoney, ONE_HUNDRED_THOUSAND, TOTAL_ONE_HUNDRED_THOUSAND, oneHundredThousand);
		newMoney = returnValMoney(newMoney, ONE_HUNDRED_THOUSAND, TOTAL_ONE_HUNDRED_THOUSAND, oneHundredThousand);
		
		// 50.000
		printCountNumberMoney(newMoney, FIFTY_THOUSAND, TOTAL_FIFTY_THOUSAND, fiftyThousand);
		newMoney = returnValMoney(newMoney, FIFTY_THOUSAND, TOTAL_FIFTY_THOUSAND, fiftyThousand);
		
		// 20.000
		printCountNumberMoney(newMoney, TWEENTY_THOUSAND, TOTAL_TWEENTY_THOUSAND, tweentyThousand);
		newMoney = returnValMoney(newMoney, TWEENTY_THOUSAND, TOTAL_TWEENTY_THOUSAND, tweentyThousand);
		
		// 10.000
		printCountNumberMoney(newMoney, TEN_THOUSAND, TOTAL_TEN_THOUSAND, tenThousand);
		newMoney = returnValMoney(newMoney, TEN_THOUSAND, TOTAL_TEN_THOUSAND, tenThousand);
		
	}
	
	//Tính số tờ tiền cùng loại và in ra kết quả
	public static void printCountNumberMoney(int money, int denoOfMoney, int totalMoney, int countMoney) {
		DecimalFormat formatter = new DecimalFormat("#,###");
		if (money >= denoOfMoney) {
			countMoney 	= money / denoOfMoney;
			if(countMoney >= totalMoney) {
				countMoney	= totalMoney;
			}
			System.out.printf("Số tờ tiền %s là: %d \n",formatter.format(denoOfMoney),countMoney);
		}
	}
	
	//Trả về giá trị tiền còn lại
	public static int returnValMoney(int money, int denoOfMoney, int totalMoney, int countMoney) {
			countMoney 	= money / denoOfMoney;
			if(countMoney >= totalMoney) {
				countMoney	= totalMoney;
			}
			money 		= money - (countMoney * denoOfMoney);
			return money;
	}

}
