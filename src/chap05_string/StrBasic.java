package chap05_string;

public class StrBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create String object
		//study06();
		
		//noi chuoi
		//study05();
		
		//chuyen doi chuoi so thanh gia tri so
		study04();
		
		//so sanh chuoi
	}
	
	public static void study01() {
		
	}
	
	public static void study02() {
			
	}
	
	public static void study03() {
		
	}
	
	public static void study04() {
		String str1 = "986";
		int num = 4;
		
		int result = (Integer.parseInt(str1)) + num;
		System.out.println(result);
	}
	
	public static void study05() {
		String str1 = "Java";
		String str2 = "C#";
		String str3 = str1 + " " + str2;
		String str4 = str1.concat(" ").concat(str2);
		
		//case1
		System.out.println(str3);
		
		//case2
		System.out.println(str1 + " " + str2);
		
		//case3
		System.out.println(str4);
	}
	
	public static void study06() {
		//case 1
		String str1 = "Java";
		
		//case 2
		String str2 = new String();
		str2 = "JaVa";
		
		//case 3
		String str3 = new String("JAVA");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
