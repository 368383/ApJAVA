package circleOfLife;

import java.io.File;
import java.util.Scanner;

public class circleOfLifeOG {
	public static int[][] originalArray = new int[20][20];

	public static void main(String args[]) {
		int[][] array = read();
		originalArray = read();
		totalCount(array, 0);
		System.out.println("ORIGINALLY");
		print(originalArray);
		for (int i = 0; i < 5; i++) {
			alg(array);
			copy(array, originalArray);
		}
		System.out.println("AFTER 5 GENERATIONS");
		print(array);
		printCol10(array);
	}

	public static void copy(int[][] original, int[][] copy) {
		for (int row = 0; row < original.length; row++) {
			for (int col = 0; col < original[row].length; col++) {
				original[row][col] = copy[row][col];

			}
		}
	}

	public static void printCol10(int[][] array) {
		int count = 0;
		for (int i = 0; i < array[9].length; i++) {
			if (array[9][i] == 1) {
				count++;
			}
		}
		System.out.println("SEQUENCE ROW 10 COUNT " + count);
		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i][9] == 1) {
				count++;
			}
		}
		System.out.println("SEQUENCE COL 10 COUNT " + count);
		count = 0;
		totalCount(array, count);
	}

	private static void totalCount(int[][] array, int count) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if (array[row][col] == 1) {
					count++;
				}
			}
		}
		System.out.println("TOTAL " + count);
	}

	public static void print(int array[][]) {
		for (int i = 0; i < array[0].length; i++) {
			System.out.print("\t" + (i + 1));
		}
		System.out.println();
		for (int row = 0; row < array.length; row++) {
			System.out.print(row + 1 + "\t");
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
					// DEATH
					originalArray[row][col] = 0;
					continue;
				case 1:
					// DEATH
					originalArray[row][col] = 0;
					continue;
				case 2:
					continue;
				case 3:
					// BIRTH
					originalArray[row][col] = 1;
					continue;
				default:
					originalArray[row][col] = 0;
					continue;

				}
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
