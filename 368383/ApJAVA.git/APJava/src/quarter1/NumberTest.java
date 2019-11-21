package quarter1;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		System.out.println("ORIGINAL ARRAY");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10) + 11;

		}
		print(array);
		System.out.println("WRONG ARRAY");

		wrongReverse(array);
		print(array);

		System.out.println("RIGHT ARRAY");
		rightReverse(array);
		print(array);

		System.out.println("REVERSE ARRAY");
		goodReverse(array);
		print(array);

	}

	public static void print(int[] displayArray) {

		for (int current : displayArray) {
			System.out.print(current + " ");
		}
		System.out.println();
	}

	public static void wrongReverse(int[] a) {
		int[] array = new int[10];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[a.length - i - 1];
		}

		a = array;
		int k = 0;

//		for (int current : a) {
//			current = array[k];
//			k++;
//		}

	}

	public static void rightReverse(int[] a) {
		int[] array = new int[10];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[a.length - i - 1];
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = array[i];
		}

//		for (int i = 0; i < a.length; i++) {
//			a[i] = array[i];
//		}

	}

	public static void goodReverse(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {
			int storageEnd = a[a.length - i - 1];
			// System.out.println("STORAgE END " + storageEnd);
			int beginStorage = a[i];
			// System.out.println("BEGIN STORE " + beginStorage);
			a[a.length - i - 1] = beginStorage;
			// System.out.println("BEGIN " + beginStorage + " END " + storageEnd);
			a[i] = storageEnd;
			// System.out.println(a[i]);
			// System.out.println(a[a.length - 1]);
			// a[a.length - 1 - i] = beginStorage;
		}
		// print(a);
	}
}
