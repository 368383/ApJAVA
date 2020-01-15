package sorting;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] list = new double[40];
		for (int i = 0; i < list.length; i++) {
			list[i] = i * 3;
		}
		// print(list);
		search(list, 3);
	}

	public static void print(double[] source) {
		int counter = 0;
		int liner = 0;
		while (true) {
			if (liner == 10) {
				System.out.println();
				liner = 0;
			}
			if (counter == source.length) {
				break;
			}
			System.out.print(source[counter] + "\t");
			counter++;
			liner++;
		}
	}

	public static void search(double[] source, double target) {
		int counter = 0;
		int roof = source.length - 1;
		int floor = 0;
		while (true) {

			int difference = (int) (roof - floor) / 2;
			debugInformation(source, roof, floor, difference);
			if (target == source[floor]) {
				System.out.println("_______________________________________" + "\nFOUND");

				System.out.println("FLOOR INDEX: " + floor + "\tSOURCE: " + source[floor]);
				break;
			}

			if (target < source[difference]) {
				roof = difference;
				continue;
			}

			if (target >= source[difference]) {
				floor = difference + floor;

				if (difference == 0 && target != source[floor] && target != source[floor + 1]) {
					System.out.println("_______________________________________" + "\nUNABLE TO BE FOUND");
					System.out.println("TARGET " + target);
					debugInformation(source, roof, floor, difference);
					break;
				}
			}

			counter++;
		}
		System.out.println("COUNTER: " + counter);
	}

	private static void debugInformation(double[] source, int roof, int floor, int difference) {
		System.out.println("FLOOR: " + source[floor] + "\t ROOF " + source[roof] + "\t DIFFERENCE: " + difference);
		System.out.println("FLOOR INDEX: " + floor + "\t ROOF INDEX: " + roof + "\t DIFFERENCE: " + difference);
	}

}
