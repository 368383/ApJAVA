package Quarter3.inherentence;

public class Tester {
	public static void main(String args[]) {
		Quad delta = new Quad();
		Square episilon = new Square(2);

		System.out.println(episilon.area());
		System.out.println(episilon.perimeter());

		old();

	}

	private static void old() {
		Quad alpha = new Quad();
		System.out.println(alpha.perimeter());
		Rect theta = new Rect();
		System.out.println(theta.perimeter());
		Rect beta = new Rect(2, 3);
		System.out.println(beta.perimeter());
		System.out.println(beta.area());
	}
}
