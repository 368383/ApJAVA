package tictaktoe;

import java.util.Scanner;

public class Game {
	public static String[] marks = new String[9];
	public static boolean[] locations = new boolean[9];
	public static int[] calcLocations = new int[5];
	public static boolean userInputIsX = true;
	public static String computerInput = "X";

	public static void set() {
		for (int i = 0; i < marks.length; i++) {
			marks[i] = " ";
		}
	}

	public Game() {
		set();
	}

	public void input(int slot, String value) {
		marks[slot] = value;
	}

	public int setSlot() {

		while (true) {
			try {
				System.out.println("SELECT SPOT");
				Scanner hs = new Scanner(System.in);
				int slot = hs.nextInt() - 1;
				if (slot <= 8 && slot >= 0) {
					return slot;
				}
				System.out.println("Insert an integer from 0 to 8");
			} catch (Exception e) {
				System.out.println("Insert an integer from 0 to 8");
			}
		}

	}

	public static boolean isStringOnlyAlphabet(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}

	public String setInput() {
		while (true) {
			try {
				System.out.println("SELECT INPUT");
				Scanner sc = new Scanner(System.in);
				String input = sc.next().toUpperCase();
				if (isStringOnlyAlphabet(input) && (input.equals("X") || input.equals("O"))) {
					return input;
				}
				System.out.println("X or O");
			} catch (Exception E) {
				E.printStackTrace();
			}
		}
	}

	public static String[] getInputs() {
		return marks;
	}

	public boolean charCheck() {
		for (String current : marks) {
			if (current.equals("X")) {
				return false;
			}
		}
		return true;
	}

	public void startingCondition() {

		if (marks[4].equals(" ")) {
			marks[4] = "X";
		} else {
			int random = (int) Math.random() * 9;
			if (charCheck()) {
				marks[random] = "X";
				// Computer will now use X
				userInputIsX = false;
			} else {
				marks[random] = "O";
				userInputIsX = true;
				computerInput = "O";
				// Computer will now use O
			}

		}
	}

	public void calculation() {
		int i = 0;
		boolean alpha = true;
		while (alpha) {
			System.out.println("I value " + i);
			int slot = calcLocations[i];
			for (int l = i; i < calcLocations.length; l++) {
				System.out.println("Computer calculating");
				int difference = calcLocations[l] - slot;
				if(marks) {
					
				}
				if (difference == 3) {
					if (l > 5) {
						marks[i - 3] = computerInput;
					} else {
						marks[l + 3] = computerInput;
					}
					alpha = false;
					break;
				}
				if (difference == 6) {
					marks[l - 3] = computerInput;
					alpha = false;
					break;
				}
				if (difference == 1) {
					if (l == 2 || l == 5 || l == 8) {
						marks[i - 1] = computerInput;
					} else {
						marks[l + 1] = computerInput;
					}
					alpha = false;
					break;
				}
				if (difference == 8) {
					marks[l - 4] = computerInput;
					alpha = false;
					break;
				}

				if (difference == 4 && calcLocations[l] % 2 == 0) {
					if (calcLocations[l] == 8) {
						marks[0] = computerInput;
					} else {
						marks[8] = computerInput;
					}
					alpha = false;
					break;
				}
				if (difference == 2 && calcLocations[l] % 2 == 0) {
					if (calcLocations[l] == 6) {
						marks[2] = computerInput;
					} else {
						marks[6] = computerInput;
					}
					alpha = false;
					break;
				}

				i++;
			}
			while (true) {
				int choose = (int) random();
				if (isOccupied(choose)) {
					alpha = false;
					continue;
				}
				marks[choose] = computerInput;
				alpha = false;
				System.out.println("Computer chose slot: " + choose + "\t alpha value " + alpha);

				break;
			}

		}
	}

	public static boolean isOccupied(int testSlot) {
		if (marks[testSlot].equals(" ")) {
			return false;
		}
		return true;
	}

	public static double random() {
		return (Math.random() * 9);
	}

	public void determineSlots() {
		if (userInputIsX) {
			System.out.println("DEBUG | COMPUTER WILL CHOOSE O");
			for (String current : marks) {
				int i = 0;
				if (current.equals("X")) {
					calcLocations[i] = i;
				}
				i++;
			}
		} else {
			System.out.println("DEBUG | COMPUTER WILL CHOOSE X");
			for (String current : marks) {
				int i = 0;
				if (current.equals("O")) {
					calcLocations[i] = i;
				}
				i++;
			}
		}
	}
}
