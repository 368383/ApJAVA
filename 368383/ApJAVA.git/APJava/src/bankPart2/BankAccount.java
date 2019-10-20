package bankPart2;

import java.io.File;
import java.util.Scanner;

public class BankAccount {
	private double balance;
	private String lastName;

	public String getLastsName() {
		return lastName;
	}

	public BankAccount() {
		balance = 0;
		lastName = "guest";
	}

	public BankAccount(String userName, double amount) {
		balance = amount;
		lastName = userName;
	}

	public void deposit(double in) {
		balance = balance + in;
	}

	public void withdrawl(double out) {
		balance = balance - out;
	}

	public String toString() {
		return "Customer Last Name " + "<" + lastName + ">" + " | Customer Balance " + "<" + balance + ">";
	}

	public double getBalance() {
		return balance;
	}

}
