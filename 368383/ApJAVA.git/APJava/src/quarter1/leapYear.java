package quarter1;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		boolean breaker = true;
		Scanner sc = new Scanner(System.in);
		double year = sc.nextInt();
		while (year > 1582 && breaker == true) {

			if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) {
				System.out.println(year + " is a leap year");
				breaker = false;
				break;
			} else {
				System.out.println(year + " is not a leap year");
				breaker = false;
				break;
			}
		}
		while (breaker == true) {
			System.out.println("Error");
			break;
		}

	}

}
