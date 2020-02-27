package Quarter3.inherentence;

public class Rect extends Quad {

	public Rect() {
		super(0, 0, 0, 0, 90, 90, 90, 90);
	}

	public Rect(int width, int height) {

		super(width, height, width, height, 90, 90, 90, 90);
	}

	public int area() {
		int[] theta = super.getSides();
		return theta[0] * theta[1];

	}

}
