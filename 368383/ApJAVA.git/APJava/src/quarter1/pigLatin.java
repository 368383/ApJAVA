package quarter1;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		while (1 == 1) {
			System.out.println("PLEASE TYPE IN YOUR TEXT. TYPE IN 'STOP' TO STOP PROGRAM ");
			String fox = process(prompt());
			if (fox.equals("stop")) {
				System.out.println("PROGRAM HAS FINISHED ");
				break;
			} else {
				System.out.println(fox);
			}
		}
	}

	public static String prompt() {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.toLowerCase().contains("stop")) {
			return "stop";
		} else {
			return input;
		}
	}

	public static boolean capital(String input) {
		String wolves = prompt();
		System.out.println("I'm tired");
		for (int i = 0; i < wolves.length(); i++) {
			if (wolves.substring(0, 1) != wolves.substring(0, 1).toLowerCase()) {
				System.out.println("I'm tired");
				return true;
			}
		}
		return false;
	}

	public static String output(boolean caps) {
		System.out.println("I'm again");
		String birds = process(prompt());
		if (caps == true) {
			return birds.substring(0, 1).toUpperCase() + birds.substring(1);
		}
		return birds;
	}

	public static String process(String input) {

		if (input.contains("stop")) {
			return "stop";
		} else {
			int cases = cases(input);
			switch (cases) {
			case 0:
				return input + "way";
			case 1:
				String addition = input + "ii";
				for (int i = 0; i < addition.length() - 2; i++) {
					String seq = addition.substring(i, i + 1);
					if ((seq.equals("a") || seq.equals("e") || seq.equals("i") || seq.equals("o") || seq.equals("u"))) {
						return input.substring(i) + input.substring(0, i) + "ay";
					}
				}
			case 2:
				int index = input.indexOf("qu");
				return input.substring(index + 2) + input.substring(0, index) + "qu" + "ay";
			case 3:
				for (int i = 0; i < input.length(); i++) {
					String seq = input.substring(i, i + 1);
					if (input.substring(0, 1).equals("y") && (seq.equals("a") || seq.equals("e") || seq.equals("i")
							|| seq.equals("o") || seq.equals("u"))) {
						return input.substring(1) + "yay";
					} else {
						for (int k = 0; k < input.length(); k++) {
							if (input.substring(k, k + 1).contentEquals("y")) {
								return input.substring(k) + input.substring(0, k) + "ay";
							}
						}
					}
				}
			case 10:
				return "INVALD";
			}
		}
		return input;
	}

	public static int cases(String input) {
		boolean valid = false;
		for (int i = 0; i < input.length(); i++) {
			String seq = input.substring(i, i + 1);
			if (input.substring(i, i + 1).contains("y") && !(input.substring(0, 1).contains("y"))) {
				return 3;
			}
			if (seq.equals("a") || seq.equals("e") || seq.equals("i") || seq.equals("o") || seq.equals("u")
					|| seq.equals("y") || seq.equals("i")) {
				valid = true;
				break;
			} else {
				if (valid == false && i == input.length() - 1) {
					return 10;
				}
			}
		}
		if (input.substring(0, 1).equals("a") || input.substring(0, 1).equals("e") || input.substring(0, 1).equals("i")
				|| input.substring(0, 1).equals("o") || input.substring(0, 1).equals("u")) {
			return 0;
		}

		String addition = input + "ii";
		for (int i = 0; i < input.length() - 2; i++) {
			if (addition.substring(i, i + 2).contains("qu")) {
				return 2;
			}
		}
		return 1;
	}
}