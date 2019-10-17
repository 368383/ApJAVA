package projectX.banking;

import java.util.Scanner;

public class BankTester {
	private static BankAccount[] customers = new BankAccount[1000];
	private static BankSecurity securityStatus;
	private static int totalCustomers = 0;

	public static void main(String[] args) throws InterruptedException {
		securityStatus = new BankSecurity(true);
		if (securityStatus.getStatus() == false) {
			System.out.println(securityStatus.getSystemMessage());
		} else {
			System.out.println(securityStatus.getSystemMessage());
			accountPrompt();
		}
	}

	public static void accountPrompt() {
		while (true) {
			System.out.println("Please inserthe following parameters. To stop program, type STOP");
			System.out.println("Enter first name");
			Scanner first = new Scanner(System.in);
			String firstName = first.next();
			System.out.println("Enter last name");
			Scanner last = new Scanner(System.in);
			String lastName = last.next();
			System.out.println("Enter Initial Amount");
			Scanner amount = new Scanner(System.in);
			int value = amount.nextInt();
			System.out.println("User logged into the system with following: " + addAccount(firstName, lastName, value));

			System.out.println("Continue adding more names? Y = Yes | N = No");
			Scanner counter = new Scanner(System.in);
			String count = counter.next();
			if (count.toUpperCase().equals("Y")) {
			} else {
				System.out.println("Program has stopped");
				break;
			}
		}
	}

	public static String addAccount(String firstName, String lastName, int initial) {

		String name = firstName + " " + lastName;
		BankAccount newAccount = new BankAccount(name, initial);

		customers[totalCustomers] = newAccount;
		String output = newAccount.toString();
		System.out.println("Balance " + newAccount.getBalance());
		totalCustomers++;
		return output;

	}

}
