package testPractice;

public class APLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APLine line1 = new APLine(5, 4, -17);
		double slope1 = line1.getSlope();
		System.out.println(slope1);
		boolean onLine;
		onLine = line1.isOnLine(5, -2);
		System.out.println(onLine);
	}

	private int a;
	private int b;
	private int c;

	public APLine(int q, int r, int s) {
		a = q;
		b = r;
		c = s;
	}

	public double getSlope() {
		double slope = (double) -a / b;
		return slope;
	}

	public boolean isOnLine(int x, int y) {
		if (x * a + b * y + c == 0) {
			return true;
		}
		return false;
	}
}
