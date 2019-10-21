package bankPart2;

import java.time.LocalDate;
import java.util.Scanner;

public class BankTester {
	private static BankAccount[] bankAccounts;

	public static void main(String[] args) {
		LocalDate currentDate = java.time.LocalDate.now();
		System.out.println(currentDate);
		// TODO Auto-generated method stub
		Banker teller = new Banker("Bob");
		bankAccounts = teller.read("bank_account_2013.txt");
		for (BankAccount currentAccount : bankAccounts) {
			System.out.println(currentAccount);
		}
		BankDay today = new BankDay(teller, currentDate, bankAccounts);

		for (int i = 0; i < 5; i++) {
			String searchInput = Utility.prompt("Input desired customer search");
			BankAccount searchResult = today.searchResult(searchInput);

			today.transaction(searchResult);
			// System.out.println(searchResult);

			today.displayAccount();
		}
		System.out.println("Program Completion");

		// optional
		teller.write("bank_account_reWrite.txt");

	}

}
