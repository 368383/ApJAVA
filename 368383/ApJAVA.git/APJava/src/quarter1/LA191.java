package quarter1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import bankPart2.BankAccount;

public class LA191 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testData = { 1, 2, 8, 10, 11, 12, 15, 25, 31, 32, 38, 39, 50, 58, 66, 68, 70, 76, 82, 89, 89, 89, 100,
				100, 100, 102, 102 };
		int[] dataRead = read("numbers.txt");
		getMedian(dataRead);
		median(dataRead);
		calcSum(dataRead);
		calcAverage(dataRead);
		getMinimum(dataRead);
		getMode(dataRead);
		getStanDev(dataRead);
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

	public static void getMedian(int[] data) {
		int[] partionedArray = new int[5];
		int loopCount = 1;
		int alphaCount = 0;
		int index = 0;
		while (true) {
			for (int i = 0; i < data.length / (int) Math.pow(5, loopCount); i++) {
				int[] median = new int[data.length / (int) Math.pow(5, loopCount)];

				// type loop
				int indexCount = 0;
				// how many cycles conducted
				for (int l = 0; l < median.length; l++) {
					alphaCount++;
					// System.out.println("______________________________");
					// System.out.println("Median length " + median.length);
					// Portioned
					// System.out.println("L value " + l * 5);
					index = 0;
					// System.out.println("K Value " + l);
					// printIndex(data);
					for (int k = l * 5; k < 5 * (l + 1); k++) {
						partionedArray[index] = data[k];
						index++;
					}
					// printIndex(partionedArray);
					// sorting
					partionedArray = sort(partionedArray);
					median[indexCount] = partionedArray[2];
					indexCount++;
				}
				// System.out.println("NEW DATA SETS");
				data = sort(median);

			}
			loopCount++;

			if (data.length % 5 != 0 || data.length <= 10) {
				// System.out.println("LOOP COUNT " + alphaCount);
				break;
			}
		}
		printIndex(data);
		// System.out.println("PROCESSING FINAL DATA");
		if (data.length % 2 == 1) {
			System.out.println("Final medium - approximated " + data[data.length / 2]);
		} else if (data.length != 2) {
			System.out.println(
					"Final medium - approximated " + (double) (data[data.length / 2 - 1] + data[data.length / 2]) / 2);
		} else {
			System.out.println("Final medium - approximated " + (double) (data[0] + data[1]) / 2);
		}
	}

	private static int[] sort(int[] partionedArray) {
		for (int testValue = 0; testValue < partionedArray.length; testValue++) {
			for (int sortI = 0; sortI < partionedArray.length; sortI++) {
				if (partionedArray[testValue] >= partionedArray[sortI]) {
				} else {
					int holder = partionedArray[sortI];
					partionedArray[sortI] = partionedArray[testValue];
					partionedArray[testValue] = holder;
				}
			}
		}
		return partionedArray;
	}

	private static void median(int[] array) {
		array = sort(array);
		System.out.println("Final medium - non approxmiated " + array[array.length / 2]);
	}

	private static void printIndex(int[] given) {
		for (int currentIndex : given) {
			System.out.println(currentIndex);
		}
		System.out.println("CYCLE COMPLETED");

	}

	public static void getMode(int[] data) {
		int[] unique = IntStream.of(data).distinct().toArray();
		System.out.println(unique.length);
		int[] modeHolder = new int[unique.length];
		int count = 0;
		int index = 0;
		for (int alpha = 0; alpha < unique.length; alpha++) {

			count = 0;
			for (int i = 0; i < data.length; i++) {
				// System.out.println("modeHolder " + unique[alpha] + " numerica " + data[i]);
				if (unique[alpha] == data[i]) {
					// System.out.println("match");
					count++;
				}

			}
			// System.out.println("index " + index + " Count " + count);
			modeHolder[index] = count;
			index++;
		}
		int max = modeHolder[0];
		for (int i = 1; i < modeHolder.length; i++) {
			if (modeHolder[i] > max) {
				max = modeHolder[i];
			}
		}
		// System.out.println("MAX " + max);
		// printIndex(modeHolder);

		for (int beta = 0; beta < modeHolder.length; beta++) {
			if (modeHolder[beta] == max) {
				System.out.println("Quantity is  " + unique[beta]);
			}
		}

	}

	public static double getStanDev(int[] data) {
		long sum = calcSum(data);
		int mean = (int) Math.floorDiv(sum, data.length);
		int summation = 0;
		for (int currentIndex : data) {
			summation = (int) (summation + Math.pow(currentIndex - mean, 2));
		}
		double dev = Math.sqrt(Math.floorDiv(summation, data.length));
		System.out.println("Standard Deviation " + dev);
		return dev;
	}

	public static int[] read(String fileName) {
		// TODO Auto-generated method stub
		int[] readData = new int[100];
		System.out.println("Reading File from Java code");
		try {
			File file = new File(fileName);
			Scanner in = new Scanner(file);
			for (int i = 0; i < 100; i++) {
				int bal = in.nextInt();
				readData[i] = bal;
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return readData;
	}
}
