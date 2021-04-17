package chap05_string;

public class StrBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create String object
		//study06();
		
		//concatenation string
		//study05();
		
		//convert string to integer
		//study04();
		
		//compare string with equals and equalsIgnoreCase
		//study03();
		
		//compare string with ==
		study02();
		
		//excess memory
		//study01();
	}
	
	//excess memory
	public static void study01() {
		String str1 = "Java is very ez";	//abc123
		str1 = "Android is very ez";		//123ndg
		str1 = "Android is too hard";		//8293ds
	}
	
	//compare string with ==
	public static void study02() {
		//java cnhd1234
		String str1 = "java"; //str1 = cnhd1234
		//String str2 = "java"; //str2 = cnhd1234
		//String str2 = "jaVa"; //str2 = asdhd1234
		String str2 = new String("java"); //str2 = sd1234
		
		//compare
		if(str1 == str2) System.out.println("Equals");
		else System.out.println("Not equals");
	}
	
	//compare string
	public static void study03() {
		String str1 = "Java";
		String str2 = "JAVA";
		
		//Comparison between upper and lower case letters
		System.out.println(str1.equals(str2));
		
		//Comparisons are not case sensitive
		System.out.println(str1.equalsIgnoreCase(str2));
	}
	
	//convert string to int
	public static void study04() {
		String str1 = "986";
		int num = 4;
		
		int result = (Integer.parseInt(str1)) + num;
		System.out.println(result);
	}
	
	//concatenation string
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
	
	//create String object
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
