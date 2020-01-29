package quarter4;

public class twoDArrayDemonstrtation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[10][10];
		initialize(a);
		print(a);
		printDiagonal(a);
//		System.out.println("SECOND col");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i][2] + " ");
//		}
	}

	public static void print(int a[][]) {
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				System.out.print(a[row][column] + " ");
			}
			System.out.println();

		}
	}

	public static void printDiagonal(int a[][]) {
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row][row] + "\t");
		}
		System.out.println();
		for (int row = 0; row < a.length; row++) {
			System.out.print(a[row][a[0].length - row-1] + "\t");

		}
	}

	public static void initialize(int a[][]) {
		int i = 1;
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				a[row][column] = i;
				i++;
			}
		}
	}
}
