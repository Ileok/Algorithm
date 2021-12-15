import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = in.next();
		StringBuilder toggle = new StringBuilder();
		char a = 0;
		for(int i=0; i < str.length(); i++) {
			a = str.charAt(i);
			a ^= 32;
			toggle.append(a);
		}
		System.out.println("출력 : "+toggle);

	}

}
