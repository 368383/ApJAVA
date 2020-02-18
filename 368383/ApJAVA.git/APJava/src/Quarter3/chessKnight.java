package Quarter3;

public class chessKnight {
	public static int[][] position = new int[8][8];
	public static int[][] trail = new int[8][8];
	public static int knightX = 0;
	public static int knightY = 0;
	public static int trailCount = 2;
	public static int cycleCount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int knight = 0;
		int knighty = 0;
		initialize();
		while (true) {
			if (move(knightX, knightY)) {
				print();
				System.out.println();
			} else {
			}
			cycleCount++;
			if (!allOccupied(knightX, knightY)) {
				break;
			}
		}
		System.out.println("Program Completion" + "\t Maximum value " + (trailCount-1));
	}

	public static boolean allOccupied(int row, int col) {
		int rowOp = 0;
		int colOp = 0;
		// left bottom
		rowOp = row - 1;
		colOp = col - 2;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// left top
		rowOp = row - 2;
		colOp = col - 1;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right bottom
		rowOp = row - 1;
		colOp = col + 2;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right top
		rowOp = row - 2;
		colOp = col + 1;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right bottom bottom
		rowOp = row + 1;
		colOp = col + 2;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right bottom top
		rowOp = row + 2;
		colOp = col + 1;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right bottom bottom
		rowOp = row + 1;
		colOp = col - 2;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {

			return true;

		}

		// right bottom top
		rowOp = row + 2;
		colOp = col - 1;
		if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
			return true;
		}
		return false;
	}

	public static void initialize() {

		for (int row = 0; row < trail.length; row++) {
			for (int col = 0; col < trail[row].length; col++) {
				trail[row][col] = 0;
				trail[0][0] = 1;

			}
			System.out.println();
		}
	}

	public static void print() {
		for (int row = 0; row < trail.length; row++) {
			for (int col = 0; col < trail[row].length; col++) {
				System.out.print(trail[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static boolean move(int row, int col) {
		int random = (int) (Math.random() * 8)+1;
		// System.out.println(random);
		int rowOp = 0;
		int colOp = 0;
		switch (random) {
		case 1:
			// left bottom
			rowOp = row - 1;
			colOp = col - 2;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 2:

			// left top
			rowOp = row - 2;
			colOp = col - 1;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 3:

			// right bottom
			rowOp = row - 1;
			colOp = col + 2;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 4:

			// right top
			rowOp = row - 2;
			colOp = col + 1;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 5:

			// right bottom bottom
			rowOp = row + 1;
			colOp = col + 2;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 6:

			// right bottom top
			rowOp = row + 2;
			colOp = col + 1;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 7:

			// right bottom bottom
			rowOp = row + 1;
			colOp = col - 2;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;

			}
		case 8:

			// right bottom top
			rowOp = row + 2;
			colOp = col - 1;
			if (rowOp < 8 && colOp < 8 && rowOp >= 0 && colOp >= 0 && !isOccupied(trail, rowOp, colOp)) {
				trail[rowOp][colOp] = trailCount;
				trailCount++;
				knightX = rowOp;
				knightY = colOp;
				return true;
			}
		default:
			// System.out.println("Not possible");

			return false;

		}

	}

	public static boolean isOccupied(int[][] array, int row, int col) {
		if (array[row][col] == 0) {
			return false;
		}
		return true;
	}

}
