package tictaktoe;

import java.util.Scanner;

public class Game {
	public static String[] marks = new String[9];
	public static boolean[] locations = new boolean[9];
	public static boolean X = true;

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

	public void startingCondition(int index) {
		if (index == 0) {
			if (marks[4].equals(" ")) {
				marks[4] = "X";
			} else {
				int random = (int) Math.random() * 9;
				if (charCheck()) {
					marks[random] = "X";
					// Computer will now use X
					X = false;
				} else {
					marks[random] = "O";
					X = true;
					// Computer will now use O
				}
			}
		}
	}

	public void calculation() {
		for (String current : marks) {
			int i = 0;
			if (current.equals("X") && X == true) {
				locations[i] = true;
			}
			locations[i] = false;
			i++;
		}

		if (X) {
			for (int i = 0; i < marks.length; i++) {

			}
		} else {

		}
	}

}
