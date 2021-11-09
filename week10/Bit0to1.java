import java.util.Scanner;

public class Bit0to1 {
	static int getPosOfRightmostSetBit(int n) {
		return (int)((Math.log10(n & -n)) / (Math.log10(2))) + 1;
	}
		
	static int setRightmostUnsetBit(int n) {
		if (n == 0)
			return 1;
			
		if ((n & (n + 1)) == 0)
			return n;
			
		int pos = getPosOfRightmostSetBit(~n);
		
		return ((1 << (pos - 1)) | n);
	}
	        
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = in.nextInt();
		System.out.println("출력 : " + setRightmostUnsetBit(n));
	}
}
