package buoi5;

public class StrProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strBuilderObj = new StringBuilder("ab239JA2VAc1de");
		//												 01234567890123
		
		// Xóa ký tự thứ hai và ký tự kế cuối			a239JA2VAc1e
		strBuilderObj.deleteCharAt(1);
		strBuilderObj.deleteCharAt(strBuilderObj.length()-2);
		System.out.println(strBuilderObj);
		
		// Xóa các ký tự SỐ trong chuỗi					aJAVAce
		for(int i = strBuilderObj.length()-1; i>=0; i--)
		{
			if(Character.isDigit(strBuilderObj.charAt(i))) {
				strBuilderObj.deleteCharAt(i);
			}
		}
		System.out.println(strBuilderObj);

		// Thêm giá trị ZendVN.com vào giữa chuỗi		aJAVZendVN.comAce
		int length = strBuilderObj.length();
		length = length % 2 == 0 ? length/2 : (length+1)/2;
		strBuilderObj.insert(length, "ZendVN.com");
		System.out.println(strBuilderObj);
	}

}
