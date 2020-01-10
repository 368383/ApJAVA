package sorting;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list = new double[1000];
		for (int i = 0; i < list.length; i++) {
			list[i] = i + 1;
		}
		search(list, 2);
	}

	public static void search(double[] source, double target) {
		int counter = 0;
		int roof = source.length - 1;
		int floor = 1;
		while (true) {
			if (target == source[floor - 1]) {
				System.out.println("FOUND");
				break;
			}
			int difference = (roof - floor) / 2;
			if (target < floor + difference) {
				roof = floor + difference;
			} else {
				if (target >= floor + difference) {
					floor = floor + difference;
					if ((target - source[floor - 1]) % 1 < 1 && (target - source[floor - 1]) % 1 > 0) {
						System.out.println("UNABLE TO BE FOUND");
						break;
					}

				}

			}
			counter++;
		}
		System.out.println("ROUNDS: " + counter);
	}

}
