package quarter1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int fi = 1;
		for(int i=1; i<=input;i++) {
			fi=fi*i;
		}
		System.out.println("int "+ input + " factorial is " + fi);
	}

}
