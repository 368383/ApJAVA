package quarter1;

import java.util.Scanner;

public class pigLatin {

	public static void main(String[] args) {
		System.out.println(process(prompt()));

	}

	public static String prompt() {
		// TODO Auto-generated method stub
		System.out.println("Input text");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		return input;
	}

	public static String process(String input) {
		boolean caps;
		String newInput = "";
		if (input.substring(0, 1) != input.substring(0, 1).toLowerCase()) {
			caps = true;
		} else {
			caps = false;
		}
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(0, 1).contains("y")) {
				newInput = input.substring(1) + "yay";
			}
			if (input.substring(i, i + 1).equals("a") || input.substring(i, i + 1).equals("e")
					|| input.substring(i, i + 1).equals("i") || input.substring(i, i + 1).equals("o")
					|| input.substring(i, i + 1).equals("u")) {
				newInput = input.substring(i) + input.substring(0, i) + "ay";
				break;
			} else {
				if (input.substring(0, 1).equals("a") || input.substring(0, 1).equals("e")
						|| input.substring(0, 1).equals("i") || input.substring(0, 1).equals("o")
						|| input.substring(0, 1).equals("u")) {
					if (input.substring(i, i + 2).equals("qu")) {
						newInput = input.substring(i + 2) + "quay";
					} else {
						newInput = input + "way";
						break;
					}
				} else {
					newInput = "INVALD INPUT";
					break;
				}

			}

		}
		if(caps ==true) {
			Input.substring(0)
		}
		return newInput;
	}

	public static void output() {
		// write your code here
	}

}
