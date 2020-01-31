package circleOfLife;

import java.io.File;
import java.util.Scanner;

public class circleOfLife {

	public static void main(String args[]) {
		int[][] array = read();
		System.out.println("Originally");
		print(array);
		alg(array);
		System.out.println("After");
		print(array);
	}

	public static void print(int array[][]) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();

		}

	}

	public static void alg(int[][] array) {
		for (int row = 0; row < array.length; row++) {

			for (int col = 0; col < array[row].length; col++) {
				int count = 0;

				try {
					// left bound
					if (array[row - 1][col] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					if (array[row - 1][col - 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					if (array[row - 1][col + 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					// right bound
					if (array[row + 1][col] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					if (array[row + 1][col - 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					if (array[row + 1][col + 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					// center bound
					if (array[row][col - 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}
				try {
					if (array[row][col + 1] == 1) {
						count++;
					}
				} catch (ArrayIndexOutOfBoundsException exception) {
				}

				// System.out.println(
				// "Count " + count + "\t Row and Column " + row + " " + col + " value" +
				// array[row][col]);

				switch (count) {
				case 0:
					array[row][col] = 0;
				case 2:
					array[row][col] = 1;
					// System.out.println("Breach");
				case 3:
					array[row][col] = 1;
					// System.out.println("Breach");

				}
//				System.out.println(
//						"Count " + count + "\t Row and Column " + row + " " + col + " value" + array[row][col]);

			}
		}
	}

	public static int[][] read() {
		int[][] board = new int[20][20];
// creating File instance to reference text file in Java
		try {
			File text = new File("life100.txt");

			// Creating Scanner instance to read File in Java
			Scanner scnr = new Scanner(text);

			// Reading each line of file using Scanner class
			// int lineNumber = 1;
			for (int i = 0; i < 100; i++) {
				int row = scnr.nextInt();
				int col = scnr.nextInt();
				board[row - 1][col - 1] = 1;
			}
		} catch (Exception e) {

		}
		return board;
	}

}
