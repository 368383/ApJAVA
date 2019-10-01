package quarter1.pigLatin;

import java.util.Scanner;

public class pigLatinCleanedVersionReverse {

	private static boolean stopProgram = false;
	private static String invalid = "INVALID";
	private static String startsWithVowel = "startsWithVowel";
	private static String containsQU = "containsQU";
	private static String defaultCase = "defaultCase";

	public static void main(String[] args) {
		while (true) {
			System.out.println("PLEASE TYPE IN YOUR TEXT. TYPE IN 'STOP' TO STOP PROGRAM ");
			String original = prompt();
			String[] inputCleaned = removePunctionAtEnd(original);
			boolean startsWithCap = isFirstCapital(inputCleaned[1]);
			String reArrangedInput = reArrange(inputCleaned[1]);
			String capInput = restoreCaps(startsWithCap, reArrangedInput);
			String finalOutPut = inputCleaned[0] + capInput + inputCleaned[2];

			String originalR = finalOutPut;
			String[] inputCleanedR = removePunctionAtEnd(originalR);
			boolean startsWithCapR = isFirstCapital(inputCleanedR[1]);
			String reversed = "";

			for (int i = 0; i < inputCleanedR[1].length(); i++) {
				reversed = inputCleanedR[1].substring(i, i + 1) + reversed;
			}
			String capInputR = restoreCaps(startsWithCapR, reversed);
			String finalOutputR = inputCleaned[0] + capInputR + inputCleanedR[2];
			if (finalOutPut.equals("INVALID")) {
				System.out.println("Invalid Input");
			} else {
				if (stopProgram) {
					System.out.println("PROGRAM HAS FINISHED ");
					break;
				} else {
					System.out.println("FORMATTED INTO PIG LATIN " + finalOutPut);
					System.out.println("REVERSED PIG LATIN " + finalOutputR);
				}
			}
		}
	}

	public static String prompt() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.toLowerCase().contains("stop")) {
			stopProgram = true;
			return "stop";
		} else {
			return input;
		}
	}

	public static boolean isFirstCapital(String input) {
		if (input.substring(0, 1).equals(input.substring(0, 1).toUpperCase())) {
			return true;
		}
		return false;
	}

	public static String[] removePunctionAtEnd(String input) {
		String returnValue[] = { "", "", "" };
		int i = 0;
		int l = 0;
		if (input.startsWith("\"")) {
			returnValue[0] = "\"";
			i = 1;
		} else {
			returnValue[0] = "";
		}
		for (l = i; l < input.length(); l++) {
			String indexTest = input.substring(l, l + 1);
			if (indexTest.equals("!") || indexTest.equals("?") || indexTest.equals(".") || indexTest.equals("\"")) {
				break;
			}
		}
		returnValue[1] = input.substring(i, l);
		returnValue[2] = input.substring(l);
		return returnValue;
	}

	public static String[] quotations(String input) {
		if (input.endsWith("\"")) {
			System.out.println("Quotes detected");
			String quotes1[] = { input.substring(1, input.length() - 1), "\"", "\"" };
			return quotes1;
		}
		String quotes[] = { "", "", "" };
		return quotes;
	}

	public static String restoreCaps(boolean caps2, String punctuation) {
		String birds = punctuation;
		if (caps2 == true) {
			return birds.substring(0, 1).toUpperCase() + birds.substring(1).toLowerCase();
		}
		return birds;
	}

	public static String reArrange(String input) {

		if (input.contains("stop")) {
			return "stop";
		} else {
			String cases = cases(input);
			switch (cases) {
			case "startsWithVowel":
				return input + "way";

			case "containsQU":
				int index = input.indexOf("qu");
				if (index != -1) {
					return input.substring(index + 2) + input.substring(0, index) + "qu" + "ay";
				} else {
					System.out.println("Invalid 2" + input);
					return invalid;

				}
			case "invalid":
				System.out.println("Invalid 3" + input);

				return invalid;
			default:
				for (int i = 0; i < input.length(); i++) {
					String seq = input.substring(i, i + 1);
					if (containsYVowel(seq, i)) {
						return input.substring(i) + input.substring(0, i) + "ay";
					}
				}
				return invalid;
			}
		}
	}

	private static boolean containsVowel(String input) {
		return input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
	}

	private static boolean containsYVowel(String input, int currentIndex) {
		if (input.equalsIgnoreCase("y") && currentIndex == 0) {
			return false;
		} else {
			return (input.equalsIgnoreCase("y") || containsVowel(input));
		}

	}

	public static String cases(String input) {
		input = input.toLowerCase();
		boolean hasVowels = false;
		for (int i = 0; i < input.length() - 1; i++) {
			String seq = input.substring(i, i + 1);
			if (containsVowel(seq) || seq.equals("y")) {
				hasVowels = true;
			} else {
				if (hasVowels == false && i == input.length() - 1) {
					return invalid;
				}
			}
		}
		if (containsVowel(input.substring(0, 1))) {
			return startsWithVowel;
		}

		for (int i = 0; i < input.length() - 2; i++) {
			if (input.substring(i, i + 2).contains("qu")) {
				return containsQU;
			}
		}
		return defaultCase;
	}
}