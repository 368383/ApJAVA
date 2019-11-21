package utility;

import java.util.Scanner;

public class Util {

	public static String getUserStringInput(String message) {
		System.out.println(message);
		Scanner userInput = new Scanner(System.in);
		String returnInput = userInput.next();
		return returnInput;
	}

	public static int getUserIntInput(String message) {
		System.out.println(message);
		Scanner userInput = new Scanner(System.in);
		int returnInput = userInput.nextInt();
		return returnInput;
	}

	public static void programCompletion() {
		System.out.println("PROGRAM COMPLETION");
	}

	public static void displayMessage(String input) {
		System.out.println(input);
	}

	public static void debugInt(int alpha) {
		System.out.println("DEBUG VALUE " + alpha);
	}

	public static void debugString(String alpha) {
		System.out.println("DEBUG VALUE " + alpha);
	}
}
