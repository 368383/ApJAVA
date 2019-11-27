package tictaktoe;

public class Display {
	// public static String[] printArray = { "A", "B", "C", "D", "E", "F", "G", "H",
	// "I" };

//	public static void main(String args[]) {
//
//		print();
//	}

	public static void print() {
		String[] printArray = Game.getInputs();

		int count = 0;
		for (int i = 0; i < 3; i++) {

			for (int l = 0; l < 3; l++) {
				// System.out.println("FIRST VALUE " + i + "\t SECOND VALUE" + l);
				System.out.print(printArray[count]);
				count++;
				if (l == 2) {

				} else {
					verticalLine();

				}
			}
			System.out.println();
			if (i == 2) {

			} else {
				horrizontalLine();
			}
		}
	}

	public static void verticalLine() {
		System.out.print("|");
	}

	public static void horrizontalLine() {
		System.out.println("-----");
	}
}
