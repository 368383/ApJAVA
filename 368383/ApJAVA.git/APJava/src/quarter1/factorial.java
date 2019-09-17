package quarter1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i = true;
		while (i) {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input < 0) {
				System.out.println("INPUT POS INT");
				continue;
			} else {
				int fi = 1;
				for (int i1 = 1; i1 <= input; i1++) {
					fi = fi * i1;
				}
				System.out.println("int " + input + " factorial is " + fi);
				i = false;
			}
		}
	}

}
