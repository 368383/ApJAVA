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
		System.out.println("RIGHT ARRAY");

		rightReverse(array);
		System.out.println("REVERSE ARRAY");

		goodReverse(array);
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
		int k = 0;

		for (int current : a) {

			current = array[k];
			k++;
		}
		print(a);
	}

	public static void rightReverse(int[] a) {
		int[] array = new int[10];
		for (int i = 0; i < a.length; i++) {
			array[i] = a[a.length - i - 1];
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = array[i];
		}
		print(a);
	}

	public static void goodReverse(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int storageEnd = a[a.length - i - 1];
			int beginStorage = a[i];
			a[i] = storageEnd;
			a[a.length - 1 - i] = beginStorage;
		}
		print(a);
	}

}
