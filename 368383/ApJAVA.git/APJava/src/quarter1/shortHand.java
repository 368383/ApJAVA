package quarter1;

import java.util.Scanner;

public class shortHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean stopper = true;
		String input = "";
		while (stopper == true) {
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine().toLowerCase() + "1111";
			if (input.contains("Q") || input.contains("q")) {
				stopper = false;
				continue;
			}
			for (int i = 0; i < input.length() - 3; i++) {
				if (input.substring(i, i + 3).equals("you")) {
					input = input.substring(0, i) + "U" + input.substring(i + 3, input.length());
				}
				if (input.substring(i, i + 3).equals("and")) {
					input = input.substring(0, i) + "&" + input.substring(i + 3, input.length());
				}
				if (input.substring(i, i + 2).equals("to")) {
					input = input.substring(0, i) + "2" + input.substring(i + 2, input.length());
				}
				if (input.substring(i, i + 3).equals("for")) {
					input = input.substring(0, i) + "4" + input.substring(i + 3, input.length());
				}
				if (input.substring(i, i + 1).equals("a")) {
					input = input.substring(0, i) + input.substring(i + 1, input.length());
				}
				if (input.substring(i, i + 1).equals("e")) {
					input = input.substring(0, i) + input.substring(i + 1, input.length());
				}
				if (input.substring(i, i + 1).equals("i")) {
					input = input.substring(0, i) + input.substring(i + 1, input.length());
				}
				if (input.substring(i, i + 1).equals("o")) {
					input = input.substring(0, i) + input.substring(i + 1, input.length());
				}
				if (input.substring(i, i + 1).equals("u")) {
					input = input.substring(0, i) + input.substring(i + 1, input.length());
				}
			}
			System.out.println("FINAL " + input.substring(0, input.length() - 4));
		}
		System.out.println("Program stopped");
	}
}
