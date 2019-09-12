package quarter1;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fToC(212));
		System.out.println(cToF(100));
		System.out.println(volume(5));
		System.out.println(pythag(3, 4));
	}

	// PROBLEM 1
	public static double fToC(int far) {
		return (5 / (double) 9) * (far - 32);
	}

	public static double cToF(int cel) {
		return (9 / (double) 5) * cel + 32;

	}

	// PROBLEM 2
	public static double volume(int radius) {
		double volume = (4 / (double) 3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}

	// PROBLEM 3
	public static double pythag(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
}
