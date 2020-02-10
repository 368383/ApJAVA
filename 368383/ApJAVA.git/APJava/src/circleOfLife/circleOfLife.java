package circleOfLife;

import java.io.File;
import java.util.Scanner;

public class circleOfLife {
	public static int[][] countArray = new int[22][22];
	// 8 6, 110
	public static void main(String args[]) {
		int[][] changeArray = read();
		countArray = read();
		totalCount(changeArray, 0);
		System.out.println("ORIGINALLY");
		print(countArray);
		for (int i = 0; i < 5; i++) {
			copyRowCol(changeArray);
			System.out.println("COPIED");

			print(changeArray);

			alg(changeArray);
			copy(changeArray, countArray);


		}
		System.out.println("AFTER 5 GENERATIONS");
		print(changeArray);
		printCol10(changeArray);
	}

	public static void copyRowCol(int[][] array) {
		for (int i = 1; i < array.length - 1; i++) {
			//PROTECTED ARRAYS
			array[0][0]=100;
			array[array.length-1][0]=100;
			array[array.length-1][array.length-1]=100;
			array[0][array.length-1]=100;


			//VERY LEFT
			array[0][i] = array[20][i];
			//VERY RIGHT
			array[21][i] = array[1][i];
			//VERY BOTTOM
			array[i][21] = array[i][1];
			//VERY TOP
			array[i][0] = array[i][21];


		}
	}

	public static void copy(int[][] original, int[][] copy) {
		for (int row = 1; row < original.length-1; row++) {
			for (int col = 1; col < original[row].length-1; col++) {
				original[row][col] = copy[row][col];

			}
		}
	}

	public static void printCol10(int[][] array) {
		int count = 0;
		for (int i = 0; i < array[9].length; i++) {
			if (array[10][i] == 1) {
				count++;
			}
		}
		System.out.println("SEQUENCE ROW 10 COUNT " + count);
		count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i][10] == 1) {
				count++;
			}
		}
		System.out.println("SEQUENCE COL 10 COUNT " + count);
		count = 0;
		totalCount(array, count);
	}

	private static void totalCount(int[][] array, int count) {
		for (int row = 1; row < array.length-1; row++) {
			for (int col = 1; col < array[row].length-1; col++) {
				if (array[row][col] == 1) {
					count++;
				}
			}
		}
		System.out.println("TOTAL " + count);
	}

	public static void print(int array[][]) {
		for (int i = 0; i < array[0].length-1; i++) {
			System.out.print("\t" + (i ));
		}
		System.out.println();
		for (int row = 0; row < array.length; row++) {
			System.out.print(row + "\t");
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();

		}

	}

	public static void alg(int[][] array) {
		for (int row = 1; row < array.length-1; row++) {
			for (int col = 1; col < array[row].length-1; col++) {
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
					countArray[row][col] = 0;
					continue;
				case 1:
					// DEATH
					countArray[row][col] = 0;
					continue;
				case 2:
					continue;
				case 3:
					// BIRTH
					countArray[row][col] = 1;
					continue;
				default:
					countArray[row][col] = 0;
					continue;

				}
			}
		}
	}

	public static int[][] read() {
		int[][] board = new int[22][22];
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
				board[row][col] = 1;
			}
		} catch (Exception e) {

		}
		return board;
	}

}
