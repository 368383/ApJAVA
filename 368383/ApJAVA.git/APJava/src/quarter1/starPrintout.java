package quarter1;

public class starPrintout {
	public static void main(String[] args) {

		int count = 0;
		for (int l = 1; l <= 6; l++) {
			for (int i = 0; i < l; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("");
		for (int a = 1; a <= 11; a++) {
			for (int d = 0; d < 11 - a; d++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int a = 0; a < 6; a++) {
			for (int b = 0; b < a; b++) {
				System.out.print("  ");
			}
			for (int d = 0; d < 12 - a * 2; d++) {
				System.out.print("*");
			}
		
			System.out.println();

		}

	}
}
