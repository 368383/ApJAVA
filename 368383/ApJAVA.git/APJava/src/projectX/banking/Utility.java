package projectX.banking;

import java.util.Scanner;

public class Utility {
	public static String readInput(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		return value;
	}
}
