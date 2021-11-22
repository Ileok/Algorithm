import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = in.nextLine();
		String[] number = input.split(" ");
		List<String> numbers = new ArrayList<String>();
		for(int i = 0; i < number.length; i++) {
			numbers.add(number[i]);
		}
		Collections.sort(numbers, (a, b) -> (b + a).compareTo(a + b));
		numbers.stream().forEach(System.out::print);
	}
}
