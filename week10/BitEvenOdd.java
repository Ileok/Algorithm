import java.util.Scanner;

public class BitEvenOdd {
	
	public static int isEven(int n) {
		return n&1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ÀÔ·Â : ");
		int n = in.nextInt();
		
		if(isEven(n) == 1) {
			System.out.println("È¦¼ö");
			
		} else { System.out.println("Â¦¼ö"); }

	}
}
