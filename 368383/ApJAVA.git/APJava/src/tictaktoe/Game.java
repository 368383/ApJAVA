package tictaktoe;

import java.util.Scanner;

public class Game {
	public static String[] marks = new String[9];
	public static boolean[] locations = new boolean[9];
	public static int[] calcLocations = new int[9];
	public static boolean userInputIsX = true;
	public static String computerInput = "";

	public static void set() {

		for (int i = 0; i < marks.length; i++) {
			marks[i] = " ";
			calcLocations[i] = 1000;
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
					for (int currentLoc : calcLocations) {
						if (isOccupied(slot)) {
							break;
						} else {
							return slot;
						}
					}
				}
				System.out.println("Insert an integer from 1 to 9");
			} catch (Exception e) {
				System.out.println("Insert an integer from 1 to 9");
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
					if (input.equals(computerInput)) {
						System.out.println("Computer has chosen the value x, select O");
					} else {
						System.out.println("The user inputed " + input);
						if (input.equals("X")) {
							System.out.println("HA Computer will use O");
							computerInput = "O";
							userInputIsX = true;
						} else {
							System.out.println("HA Computer will use X");
							computerInput = "X";
							userInputIsX = false;
						}
						return input;
					}
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

	public void calculation() {
		int index = 0;
		boolean alpha = true;
		while (alpha) {
			int slot = calcLocations[index];
			for (int beta = index + 1; beta < locations.length; beta++) {
				int difference = calcLocations[beta] - slot;
				System.out.println("BASE SLOT: " + slot + "\t index: " + index + "\t difference: " + difference
						+ "\t beta: " + beta);
				if (marks[4].equals(" ")) {
					System.out.println("OPTION BEGIN");
					marks[4] = computerInput;
					alpha = false;
					break;
				}
				// OPTION ONE - NEXT TO EACH OTHER
				if ((difference == 1) && (beta % 3 != 0)) {
					if ((beta == 1 || beta == 4 || beta == 7) && (!isOccupied(beta + 1))) {
						System.out.println("OPTION ONE A");
						marks[beta + 1] = computerInput;
					} else {
						if (!isOccupied(beta - 1)) {
							System.out.println("OPTION ONE B");
							marks[beta - 1] = computerInput;
						} else {
							// remaining slot
						}
					}
					alpha = false;
					break;
				}
				// OPTION TWO A - SAME ROW
				if ((difference == 2) && slot % 3 == 0 && (!isOccupied(beta - 1))) {
					System.out.println("OPTION TWO A");
					marks[beta - 1] = computerInput;
					alpha = false;
					break;
				}
				// OPTION TWO B - DIAGONALS RIGHT BOUND
				if ((difference == 2)) {
					if (beta == 4 && !isOccupied(6)) {
						System.out.println("OPTION TWO B A");
						marks[beta + 2] = computerInput;
					} else {
						if (!isOccupied(2)) {
							System.out.println("OPTION TWO B B");
							marks[beta - 4] = computerInput;
						}
					}
					alpha = false;
					break;
				}
				// OPTION THREE VERTICAL NEXT
				if (difference == 3) {
					System.out.println("OPTION THREE A");
					if ((beta == 3 || beta == 4 || beta == 5) && !isOccupied(beta + 3)) {
						marks[beta + 3] = computerInput;
					} else {
						if (!isOccupied(beta - 6)) {
							System.out.println("OPTION THREE B");
							marks[beta] = computerInput;
						}
					}
					alpha = false;
					break;
				}
				// OPTION FOUR LEFT BOUND DIAGONALS
				if ((difference == 4)) {
					if (beta == 4 && !isOccupied(beta)) {
						System.out.println("OPTION FOUR A");
						marks[beta + 4] = computerInput;
					} else {
						if (!isOccupied(beta)) {
							System.out.println("OPTION FOUR B");
							marks[beta - 8] = computerInput;
						}
					}
					alpha = false;
					break;
				}
				// OPTION SIX VERTICAL
				if (difference == 6 && !isOccupied(beta - 3)) {
					System.out.println("OPTION SIX");
					marks[beta - 3] = computerInput;
					alpha = false;
					break;
				}

			}
			index++;
			if (index == marks.length) {
				break;
			}
		}
		while (alpha) {
			System.out.println("Corner selection");
			int[] corners = { 0, 2, 6, 8 };
			for (int random = 0; random < corners.length; random++) {
				if (isOccupied(corners[random]) == true) {
					System.out.println("OCCUPIED");
				} else {
					System.out.println(corners[random] + "\tINPUT");
					marks[corners[random]] = computerInput;
					alpha = false;
					break;
				}
			}
		}

	}

	public static boolean isFilled() {
		for (String currentMark : marks) {
			if (currentMark.equals(" ")) {
				return false;
			}
		}
		return true;
	}

	public static boolean isOccupied(int testSlot) {

		if (marks[testSlot].equals(" ")) {
			// System.out.println("NOT OCCUPIED");
			return false;
		}
		// System.out.println("OCCUPIED");
		return true;
	}

	public static double random() {
		return (Math.random() * 9);
	}

	public void determineSlots() {
		if (userInputIsX) {
			System.out.println("DEBUG | COMPUTER WILL CHOOSE O");
			int i = 0;
			for (String current : marks) {
				if (current.equals("X")) {
					System.out.println("X DETECTED @ " + i);
					calcLocations[i] = i;
					// computerInput = "O";
				}
				i++;
				// System.out.println("I VALUE " + i);
			}
		} else {
			System.out.println("DEBUG | COMPUTER WILL CHOOSE X");
			int i = 0;
			for (String current : marks) {
				if (current.equals("O")) {
					System.out.println("O DETECTED @ " + i);
					calcLocations[i] = i;
				}
				i++;
//				System.out.println("I VALUE " + i);

			}
		}
		// readMarks();
		// readLocations();
	}

	private void readLocations() {
		System.out.println("LOCATIONS DISPLAY");
		for (int current : calcLocations) {
			System.out.print("\t DEBUG slots" + current);
		}
	}

	private void readMarks() {
		for (String current : marks) {
			System.out.print("\t DEBUG slots" + current);
		}
	}

}
