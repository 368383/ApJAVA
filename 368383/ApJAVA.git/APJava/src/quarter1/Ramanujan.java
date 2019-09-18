package quarter1;

import java.util.Scanner;

public class Ramanujan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i <= input; i++) {
			double limit = Math.cbrt(i / 2);
			for (int i1 = 1; i1 <= limit; i1++) {
				double x = Math.cbrt(i - Math.pow(i1, 3));
				if (x % 1 == 0) {
					System.out.println(i1 + " and " + (int) x + " = " + (int) (Math.pow(i1, 3) + Math.pow(x, 3)));
				}
			}
		}
	}
}
