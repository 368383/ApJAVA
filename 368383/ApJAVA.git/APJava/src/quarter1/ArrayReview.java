package quarter1;

public class ArrayReview {
	public static void main(String args[]) {
		int[] a = new int[10];
		for (int currentIndex : a) {
			System.out.print(currentIndex + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			sum += a[i];
			System.out.println(a[i]);
		}
		System.out.println("SUM " + sum);

		String[] b = new String[5];
		for (String currentIndex : b) {
			System.out.println(currentIndex);
		}

		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.toString((int) (Math.random() * 100));
		}
		System.out.println("FORWARD");
		for (String alpha : b) {
			System.out.println(alpha);
		}
		System.out.println("BACKWARD");
		for (int i = b.length - 1; i >= 0; i--) {
			System.out.println(b[i]);
		}
		int eachSum = 0;

		System.out.println("GIVEN DATA SET");
		int[] c = { 6, 5, 8, 3, 9, 1, 0, 3, 4, 2, 9, 7, 6, 8, 4, 9 };
		for (int z = 0; z < c.length; z++) {
			eachSum += c[z];
		}
		System.out.println("SUM OF ELEMENTS " + eachSum / c.length);
		eachSum = 0;
		for (int current : c) {
			eachSum += current;
		}
		System.out.println("FOR EACH SUM " + eachSum / c.length);
	}
}
