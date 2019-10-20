package bankPart2;

import java.util.Scanner;

public class Utility {
	public static String prompt(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
	}
}
