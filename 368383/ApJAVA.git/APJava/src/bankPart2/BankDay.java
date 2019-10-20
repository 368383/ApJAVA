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
		System.out.println("What type of transaction would you like to preform?");
		System.out.println("W for WITHDRAWL | D for DEPOSIT");
		Scanner choice = new Scanner(System.in);
		String input = choice.next();
		if (input.toUpperCase().equals("W")) {
			System.out.println("Input Amount to WITHDRAW");
			Scanner amountWithdraw = new Scanner(System.in);
			int withdraw = amountWithdraw.nextInt();
			account.withdrawl(withdraw);
		} else {
			System.out.println("Input Amount to DEPOSIT");
			Scanner amountDeposit = new Scanner(System.in);
			int deposit = amountDeposit.nextInt();
			account.deposit(deposit);
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
