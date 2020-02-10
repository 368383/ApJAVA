package Quarter3;

import java.util.Scanner;

public class relativelyPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		boolean[][] array = new boolean[size][size];
		// System.out.println("print");

		circulation(array);
		// System.out.println("print");
		print(array);
	}

	public static void circulation(boolean[][] array) {

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = eval(row, col);
			}
		}
	}

	public static void print(boolean[][] array) {
		System.out.print("\t");
		for (int i = 0; i < array[0].length; i++) {
			System.out.print(i + "\t");
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

	public static boolean eval(int a, int b) {
		for (int i = 2; i < 9; i++) {
			if (!(a<2||b<2)&&a % i == b % i && a % i == 0) {
				return false;
			}
		}
		return true;
	}

}
