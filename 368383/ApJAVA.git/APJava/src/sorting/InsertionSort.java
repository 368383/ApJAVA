package sorting;

public class InsertionSort {
	public static void main(String args[]) {
		long startTime = System.nanoTime();

		int[] list = new int[10];
		random(list);
		sort(list);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}

	public static void random(int[] list) {
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10) + 1;
		}
	}

	public static int[] sort(int[] list) {
		int temp = 0;
		int testIndex = 0;
		for (int i = 1; i < list.length; i++) {
			System.out.println("_______________________________________________");
			temp = list[i];
			testIndex = i;
			print(list);

			while (testIndex > 0 && temp < list[testIndex - 1]) {
				System.out.println(list[testIndex] + "\t" + list[testIndex - 1]);
				list[testIndex] = list[testIndex - 1];
				testIndex--;
			}
			print(list);

			list[testIndex] = temp;

		}
		return list;
	}

	public static void print(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		System.out.println();

	}
}
