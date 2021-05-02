package buoi7;

public class ConvertString {

	public static void main(String[] args) {
		String str = "luutruonghailan";
		String key = "3633";
		
		String result 	= "";
		int endIndex	= 0;
		int startIndex	= 0;
		
		for (int i = 0; i < key.length(); i++) {
			int currentNumber = Integer.parseInt(key.charAt(i)+"");
			
			endIndex+=currentNumber;
			
			String word = str.substring(startIndex, endIndex) + " ";
						
			word = word.substring(0,1).toUpperCase()+word.substring(1);

			result += word;
			startIndex += currentNumber;
		}
		System.out.println(result.trim());

	}

}
