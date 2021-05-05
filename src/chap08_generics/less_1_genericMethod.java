package chap08_generics;

public class less_1_genericMethod {

	public static void main(String[] args) {
		Integer[] arrInt = {10,20,30,40,50};
		String[] arrStr = {"Java","Android","PHP"};
		
		printArray(arrInt);
		printArray(arrStr);
	}
	
	public static <T> void printArray(T[] arr) {
		for(T elm: arr) {
			System.out.println(elm);
		}
	}
}
