package projectX;

public class MathLeagueqQ10 {

	public static double increment = 0.01;
	public static double x = 0.08;
	public static double y = 0;
	public static double baseValue = -5;
	public static double limitValue = 5;
	public static boolean solved = false;
	public static double smallest = 0;

	public static void main(String[] args) {
		// System.out.println("baseValue " + baseValue + "\t UpperValue " + limitValue);
		double answer = recursive2(baseValue, limitValue);
		if (solved) {
			System.out.println("SOLVED " + answer);
		} else {
			System.out.println("CANNOT BE SOLVED");
		}

//		y = y(x);
//		smallest = sum(x, y);
//		System.out.println("X INPUT: " + x + "\tSUMMATION " + "\tSmallest: " + smallest);
//
//		x = x + increment;
//		y = y(x);
//		double answer = recurisve(x, y);
//		// loopMethod();
//		System.out.println(answer);

	}

	private static double recurisve(double XInput, double YInput) {
		double sum = sum(XInput, YInput);
		System.out.println("X INPUT: " + XInput + "\tSUMMATION " + sum + "\tSmallest: " + smallest);
		if (smallest - sum >= 0) {
			smallest = sum;
			XInput = XInput + increment;
			YInput = y(XInput);
			recurisve(XInput, YInput);
		} else {
			System.out.println("MAXED OUT \t DIFFERENCE " + (smallest - sum) + " \n AT THIS x value \t " + XInput);
			return 0;
		}
		return 0;
	}

	private static double recursive2(double lowerValue, double upperValue) {
		baseValue = lowerValue;

		System.out.println("NEXT SEQUENCE " + "=============================================");
		System.out.println("Upper Value " + upperValue + "\tBase Value " + baseValue + "\t Lower Value" + lowerValue);
		System.out.println("_____________________________________________");

		if (upperValue - lowerValue < increment) {
			System.out.println("less than condition "
					+ Math.abs(Math.abs(sum(lowerValue, y(lowerValue))) - Math.abs(sum(upperValue, y(upperValue)))));
			System.out.println("PRECISION LIMIT");
			return 0;
		}

		double domain = upperValue - lowerValue;
		System.out.println("domain " + domain);
		for (int i = 0; i < 10; i = i + 1) {
			double base = baseValue + (domain / 10) * i;
			double top = baseValue + (domain / 10) * (i + 1);
			double LowerTolerance = sum(base, y(base));
			double UpperTolerance = sum(top, y(top));
			System.out.println();
			System.out.println("ORDERED PAIRS\t" + "(" + base + "," + LowerTolerance + ")" + "\t" + "(" + top + ","
					+ UpperTolerance + ")");
			if (UpperTolerance - LowerTolerance < 0) {
				System.out.println("CHANGE DETECTED | " + "\t LOWER: " + base + "\t UPPER: " + top);
				recursive2(base, top);
				break;
			} else {
			}
		}
		System.out.println("PROGRAM ERROR");
		return 0;

	}

	private static void loopMethod() {

		double sum = 0;
		double i = increment;
		y(i);
		double smallest = sum(i, y);

		for (i = 0.001; i < 0.25; i = increment + i) {
			y(i);
			sum = sum(i, y);
			if (sum < smallest) {
				smallest = sum;
			} else {
				break;
			}
		}
		System.out.println("X value " + i + "\tSUM: " + sum);
	}

	public static double y(double x) {
		return (1 - 4 * x) / 9;
	}

	public static double sum(double x2, double y2) {
		return 1 / x2 + 1 / y2;
	}
}
