package projectX.banking;

import java.util.Scanner;

public class BankTester {
	private static BankAccount[] customers = new BankAccount[1000];
	private static BankSecurity status;
	private static int totalCustomers = 0;

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter in Credentials");

		status = new BankSecurity(true);
		if (status.getStatus() == false) {
			System.out.println(status.getSystemMessage());
		} else {
			System.out.println(status.getSystemMessage());

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
		// System.out.println("Balance " + newAccount.balance);
		// newAccount.balance=newAccount.balance+100.00;
		totalCustomers++;
		return output;

	}

}
//originally in main 
//// TODO Auto-generated method stub
//customers = new BankAccount[1000];
//BankAccount account0 = new BankAccount("bob", 1000);
//
////for (int i = 0; i < 10; i++) {
////	customers[1] = new BankAccount("Something", 100);
////
//////	account0.deposit(505.22);
//////	System.out.println(account1.getBalance());
//////
//////	account1.withdrawl(1000);
//////	System.out.println(account1.toString());
////}