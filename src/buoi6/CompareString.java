package buoi6;

public class CompareString {

	public static void main(String[] args) {
		String id 	= "69";
		String str	= "78, 60,62,69,69,68,73,85,66    ,69,65,74,63,67 ,65,64,68,73,75,69,73,169";
		
		str = str.replaceAll(" ", "");
		
		String[] arrStr = str.split(",");
		
		int count 	= 0;

		for(String n : arrStr)
		{
			if(n.equals(id))
				count++;
		}
		System.out.printf("%s xuất hiện %d lần trong chuỗi",id,count);
		
	}
}
