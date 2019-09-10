package quarter1;

import java.util.Scanner;

public class CollegeSelector {
	public static void main(String[] args) {
		System.out.println("Please type in your desired school tier");
		Scanner sc = new Scanner(System.in);
		int tier = sc.nextInt();

		System.out.println("Please type in your desired school size");
		Scanner sc2 = new Scanner(System.in);
		String size = sc2.next();

		System.out.println("Please type in your desired school location");
		Scanner sc1 = new Scanner(System.in);
		String location = sc1.next();

		if (tier == 1) {
			if (size.contains("s")) {
				if (location.contains("w")) {
					System.out.println("Harvey Mudd (CA)");
				} else {
					System.out.println("MIT(MA)");
				}
			} else {
				if (location.contains("w")) {
					System.out.println("U of Wisconsin (WS)");
				} else {
					System.out.println("Penn State (PA) ");
				}
			}

		} else {
			if (tier == 2) {
				if (size.contains("s")) {
					if (location.contains("w")) {
						System.out.println("Denver University (CO)");
					} else {
						System.out.println("Capital University (OH)");
					}
				} else {
					if (location.contains("w")) {
						System.out.println("U of Oregon (OR)");
					} else {
						System.out.println("Syracuse (NY) ");
					}
				}

			}
		}
	}
}
