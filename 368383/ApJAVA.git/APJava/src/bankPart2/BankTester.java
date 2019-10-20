package bankPart2;

import java.time.LocalDate;
import java.util.Scanner;

public class BankTester {
	private static BankAccount[] bankAccounts;

	public static void main(String[] args) {
		LocalDate currentDate = java.time.LocalDate.now();
		System.out.println(currentDate);
		// TODO Auto-generated method stub
		Banker teller = new Banker();
		bankAccounts = teller.read("bank_account_2013.txt");
		for (BankAccount currentAccount : bankAccounts) {
			System.out.println(currentAccount);
		}
		BankDay today = new BankDay(teller, currentDate, bankAccounts);

		for (int i = 0; i < 5; i++) {
			System.out.println("Input desired customer search");
			Scanner search = new Scanner(System.in);
			String searchInput = search.next();
			BankAccount result = today.searchResult(searchInput);

			today.transaction(result);
			System.out.println(result);
		}
		System.out.println("Program Compeltion");
	}

}
