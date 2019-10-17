package projectX.banking;

import java.util.Scanner;

public class BankTester {
	private static BankAccount[] customers = new BankAccount[1000];
	private static BankSecurity securityStatus;
	private static int totalCustomers = 0;

	public static void main(String[] args) throws InterruptedException {
		securityStatus = new BankSecurity();
		boolean isAuthorized = securityStatus.passwordChecker();
		if (isAuthorized == false) {
		} else {
			accountPrompt();

		}
	}

	private static String readInput(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		return value;
	}

	private static void accountPrompt() {
		while (true) {
			System.out.println("Please inserthe following parameters. To stop program, type STOP");
			String firstName = readInput("Enter first name");
			String lastName = readInput("Enter last name");
			String stringValue = readInput("Enter Initial Amount");
			int value = Integer.valueOf(stringValue);
			BankAccount result = addAccount(firstName, lastName, value);
			System.out.println("Add User to the system: " + result.toString());
			String count = readInput("Continue adding more names? Y = Yes | N = No");
			if (count.toUpperCase().equals("Y")) {
			} else {
				System.out.println("Program has stopped");
				break;
			}
		}
	}

	private static BankAccount addAccount(String firstName, String lastName, int initial) {

		String name = firstName + " " + lastName;
		BankAccount newAccount = new BankAccount(name, initial);

		customers[totalCustomers] = newAccount;

		System.out.println("Balance " + newAccount.getBalance());
		totalCustomers++;
		return newAccount;

	}

}
