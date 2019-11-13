package quarter1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import bankPart2.BankAccount;

public class LA191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dataRead = read("numbers.txt");
		calcSum(dataRead);
		calcAverage(dataRead);
		getMinimum(dataRead);
		getMode(dataRead);
	}

	public static long calcSum(int[] data) {
		long sum = 0;
		for (int index : data) {
			sum = sum + index;
		}
		System.out.println("Sum " + sum);
		return sum;
	}

	public static double calcAverage(int[] data) {
		long sum = 0;
		for (int index : data) {
			sum = sum + index;
		}
		double average = sum / data.length;
		System.out.println("Sum " + average);
		return average;
	}

	public static int getMinimum(int[] data) {
		int minHolder = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < minHolder) {
				minHolder = data[i];
			}
		}
		System.out.println("MIN value " + minHolder);
		return minHolder;
	}

	public static int getMedian(int[] data) {
		int[] unique = IntStream.of(data).distinct().toArray();
		int[] modeHolder = new int[unique.length];
		int frequency = data[0];
		int count = 0;
		int index = 0;
		for (int uniqueNumber : unique) {
			count = 0;
			for (int i = 0; i < data.length; i++) {
				if (uniqueNumber == data[i]) {
					count++;
				}
				modeHolder[index] = count;
				index++;
			}
		}
		int max = modeHolder[0];
		for (int i = 1; i < modeHolder.length; i++) {
			if (modeHolder[i] > max) {
				max = data[i];
			}
		}
		

	}

	public static int getMode(int[] data) {
		int[] unique = IntStream.of(data).distinct().toArray();
		int[] modeHolder = new int[unique.length];
		int frequency = data[0];
		int count = 0;
		int index = 0;
		for (int uniqueNumber : unique) {
			count = 0;
			for (int i = 0; i < data.length; i++) {
				if (uniqueNumber == data[i]) {
					count++;
				}
				modeHolder[index] = count;
				index++;
			}
		}
		int max = modeHolder[0];
		for (int i = 1; i < modeHolder.length; i++) {
			if (modeHolder[i] > max) {
				max = data[i];
			}
		}

		int maxIndex = Arrays.asList(modeHolder).indexOf(max);
		System.out.println("MODE " + unique[maxIndex]);

		return unique[maxIndex];
	}

	public static double getStanDev(int[] data) {
	}

	public static int[] read(String fileName) {
		// TODO Auto-generated method stub
		int[] readData = new int[100];
		System.out.println("Reading File from Java code");

		try {

			File file = new File(fileName);
			Scanner in = new Scanner(file);

			// Variable to hold the one line data
			String line;

			// Read file line by line and print on the console
			for (int i = 0; i < 100; i++) {
				int bal = in.nextInt();
				readData[i] = bal;
			}
			// Close the buffer reader
			in.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return readData;
	}
}
