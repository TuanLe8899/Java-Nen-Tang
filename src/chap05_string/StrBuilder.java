package chap05_string;

public class StrBuilder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strbuild = new StringBuilder("Java");
		
		//append
		strbuild.append(" easy");
		System.out.println("append: " +strbuild);
		
		//insert
		//Java easy
		//012345678
		strbuild.insert(5, "is very ");
		System.out.println("insert: "+strbuild);
		
		//deleteChartAt
		strbuild.deleteCharAt(0);
		strbuild.deleteCharAt(strbuild.length()-1);
		System.out.println("deleteCharAt: "+strbuild);
		
		//delete
		strbuild.delete(1, 10+1);
		System.out.println("delete: "+strbuild);
	}

}
