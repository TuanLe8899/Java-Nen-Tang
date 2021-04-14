package buoi3;

public class ShapeNumberZsolu2 {
	public static void main(String[] args) {
	int number=1;
	while (number <=7 ) {
	for(int i=1; i<=7;i++) {
		if(number == 1 || number ==7)System.out.print(" "+ i);
		else {
		if(number==i)
		System.out.print(i+" ");
		else 
		System.out.print("  ");			
		}
	}
		System.out.println();
		number++;
		}
	}

}
