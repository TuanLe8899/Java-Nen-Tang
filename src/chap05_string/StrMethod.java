package chap05_string;

public class StrMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "JAVA is very easy";
		
		//length
		System.out.printf("length of '%s': %d \n",str,str.length());
		
		//charAt
		System.out.println("---------------------------");
		System.out.printf("char of '%s' at index 0: %s \n",str,str.charAt(str.length()-1));
		
		//toLowerCase
		System.out.println("---------------------------");
		System.out.printf("'%s' when LowerCase: %s \n",str, str.toLowerCase());
		
		//toUpperCase
		System.out.println("---------------------------");
		System.out.printf("'%s' when UpperCase: %s \n",str, str.toUpperCase());
		
		//trim
		System.out.println("---------------------------");
		String newstr = "   "+str;
		System.out.printf("'%s' before trim: %s \n",newstr, newstr);
		System.out.printf("'%s' after trim: %s \n",newstr, newstr.trim());
		
		//substring
		System.out.println("---------------------------");
		String substr = str.substring(2,str.length()-2);
		System.out.printf("'%s' after substring from index 2 to 8: %s \n",str, substr);

	}

}
