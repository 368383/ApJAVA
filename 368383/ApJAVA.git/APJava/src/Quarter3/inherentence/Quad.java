package Quarter3.inherentence;

public class Quad {
	int[] sides;
	public int[] getSides() {
		return sides;
	}
	int[] angles;

	public int[] getAngles() {
		return angles;
	}

	public Quad() {
		sides = new int[4];
		angles = new int[4];
	}

	public Quad(int side1, int side2, int side3, int side4, int angles1, int angles2, int angles3, int angles4) {
		sides = new int[] { side1, side2, side3, side4 };
		angles = new int[] { angles1, angles2, angles3, angles4 };
	}

	public int area() {
		// use cross product
		return 0;
	}

	public int perimeter() {
		int sum = 0;
		for (int currentVal : sides) {
			sum = sum + currentVal;
		}
		return sum;
	}
}
