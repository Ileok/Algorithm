import java.util.Scanner;

public class BitEvenOdd {
	
	public static int isEven(int n) {
		return n&1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = in.nextInt();
		
		if(isEven(n) == 1) {
			System.out.println("Ȧ��");
			
		} else { System.out.println("¦��"); }

	}
}
