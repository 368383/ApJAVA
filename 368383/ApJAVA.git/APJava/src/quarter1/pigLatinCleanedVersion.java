package quarter1;

import java.util.Scanner;

public class pigLatinCleanedVersion {

	private static boolean stopProgram = false;
	private static String invalid = "INVALD";
	private static String startsWithVowel = "startsWithVowel";
	private static String containsQU = "containsQU";
	private static String defaultCase = "defaultCase";

	public static void main(String[] args) {
		while (true) {
			System.out.println("PLEASE TYPE IN YOUR TEXT. TYPE IN 'STOP' TO STOP PROGRAM ");
			String original = prompt();
			String[] inputCleaned = removePunctionAtEnd(original);
			boolean startsWithCap = isFirstCapital(inputCleaned[0]);
			String reArrangedInput = reArrange(inputCleaned[0]);
			String capInput = restoreCaps(startsWithCap, reArrangedInput);
			String finalOutPut = capInput + inputCleaned[1];
			if (stopProgram) {
				System.out.println("PROGRAM HAS FINISHED ");
				break;
			} else {
				System.out.println(finalOutPut);
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
		String wolves = input;
		if (wolves.substring(0, 1).equals(wolves.substring(0, 1).toUpperCase())) {
			return true;
		}
		return false;
	}

	public static String[] removePunctionAtEnd(String input) {
		String returnValue[] = { input, "" };

		String lastChar = input.substring(input.length() - 1, input.length());
		if (lastChar.equals("!") || lastChar.equals("?") || lastChar.equals(".")) {
			returnValue[0] = input.substring(0, input.length() - 1);
			returnValue[1] = input.substring(input.length() - 1);
		}

		return returnValue;
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
				/*
				 * case "doubleY": for (int i = 0; i < input.length() - 1; i++) { String seq =
				 * input.substring(i, i + 1); if (input.substring(0, 1).equals("y")) { if
				 * (containsVowel(seq)) { return input.substring(1) + "yay"; }
				 * 
				 * } else { for (int i1 = 0; i1 < input.length() - 1; i1++) { if
				 * (input.charAt(i1) == 'y') { return input.substring(i1) + input.substring(0,
				 * i1) + "ay"; } } System.out.println("Invalid 1" + input); return invalid; } }
				 */

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