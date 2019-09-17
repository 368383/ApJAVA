package quarter1;

import java.util.Scanner;

public class Ramanujan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		for (int i = 1; i < input; i++) {
			double x = Math.cbrt(input - Math.pow(i, 3));
			if ((x % 1 == 0 || x % 2 == 0)&&x>0) {
				System.out.println(i+" and " + x );
				continue;
			} else {
			}

		}
	}

}
