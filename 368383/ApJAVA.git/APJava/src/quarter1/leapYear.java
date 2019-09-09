package quarter1;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		while (1 == 1) {
			Scanner sc = new Scanner(System.in);
			double year = sc.nextInt();

			if (year > 1582 && ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) {
				System.out.println(year + " is a leap year");
			} else {
				System.out.println(year + " is not a leap year");
			}
		}
	}

}
