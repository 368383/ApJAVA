package projectX.banking;

import java.util.Scanner;

public class Utility {
	public static String prompt(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		return value;
	}

	public static void debug(String prompt) {
		System.out.println("DEBUGGIN INFORMATION " + prompt);
	}
}
