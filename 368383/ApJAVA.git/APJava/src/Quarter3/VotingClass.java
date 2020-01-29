package Quarter3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VotingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ballots = read();
		print(ballots);
		System.out.println("Length " + ballots.length);
		result(ballots);
	}

	public static void print(int a[][]) {
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				System.out.print(a[row][column] + " ");
			}
			System.out.println();

		}
	}

	public static void result(int i[][]) {
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int index = 0;
		for (index = 0; index < i.length; index++) {
			if (!valid(i, index)) {
				continue;
			} else {
				int count = 0;
				for (int a = 0; a < i[index].length; a++) {
					if (i[index][a] == 0) {

					} else {
						switch (a) {

						case 0:
							zeroCount++;
						case 1:
							oneCount++;
						case 2:
							twoCount++;
						case 3:
							threeCount++;
						}
					}
				}
			}
		}
		System.out.println("RESULTS");
		System.out.println("First Candidate\t" + zeroCount);
		System.out.println("Second Candidiate\t" + oneCount);
		System.out.println("Third Candidiate\t" + twoCount);
		System.out.println("Fourth Candidiate\t" + threeCount);

	}

	public static boolean valid(int i[][], int index) {
		int count = 0;
		boolean select = false;
		for (int seq = 0; seq < i[index].length; seq++) {
			if (i[index][seq] == 1) {
				count++;
			}
		}
		if (count == 3) {
			return false;
		}

		return true;
	}

	public static int[][] read() {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("vote.txt"));
			int[][] ballots = new int[2000][4];
			for (int row = 0; row < ballots.length; row++) {
				for (int col = 0; col < ballots[0].length; col++) {
					ballots[row][col] = scanner.nextInt();
				}
			}
			return ballots;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
