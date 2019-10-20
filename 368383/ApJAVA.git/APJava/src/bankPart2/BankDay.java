package bankPart2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankDay {
	private static LocalDate currentDate;
	private Banker todayBanker;
	private static BankAccount[] bankAccounts;
	private BankAccount targetAccount;

	public static LocalDate getToday() {
		return currentDate;
	}

	public BankAccount searchResult(String lastName) {
		BankAccount requestedAccount;
		for (BankAccount account : bankAccounts) {
			if (account.getLastsName().equalsIgnoreCase(lastName)) {
				targetAccount = account;
				return requestedAccount = account;
			}
		}

		return null;
	}

	public void transaction(BankAccount account) {
		String input = Utility
				.prompt("What type of transaction would you like to preform? \nW for WITHDRAWL | D for DEPOSIT");
		if (input.toUpperCase().equals("W")) {

			String withdrawPrompt = Utility.prompt("Input Amount to WITHDRAW");
			int withdraw = Integer.parseInt(withdrawPrompt);
			account.withdrawl(withdraw);
		} else if (input.toUpperCase().equals("D")) {
			String depositPrompt = Utility.prompt("Input Amount to DEPOSIT");
			int deposit = Integer.parseInt(depositPrompt);
			account.deposit(deposit);
		} else {
			System.out.println("Invalid Input");
		}

	}

	public BankDay(Banker teller, LocalDate today, BankAccount[] bankAccounts2) {
		currentDate = today;
		todayBanker = teller;
		bankAccounts = bankAccounts2;
	}

	public void displayAccount() {
		System.out.println(targetAccount.toString() + todayBanker.greeter(targetAccount.getLastsName()));
	}

}
