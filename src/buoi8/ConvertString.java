package buoi8;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str 	= "ab@#AB69C!}+21";

		String strNumber	= str.replaceAll("\\D","");
		String strCharacter	= str.replaceAll("\\W|\\d","");
		String strSpecial	= str.replaceAll("\\w","");
		
		System.out.println("Chuỗi số: " + strNumber); 
		System.out.println("Chuỗi chữ: " + strCharacter); 
		System.out.println("Chuỗi đặc biệt: " + strSpecial);
	}

}
