package Q2.banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
	public static ArrayList<BankAccount> listOfAccounts = new ArrayList<BankAccount>();

	public static void main(String[] args) {
		while (true) {
			String inputString = promptName();
			if (inputString.toLowerCase().equals("exit")) {
				System.out.println("Moving on to find max");
				break;
			} else {
				double inputAmount = promptAmount();
				listOfAccounts.add(new BankAccount(inputString, inputAmount));
			}
		}
		findMax(listOfAccounts);

	}

	public static void findMax(ArrayList<BankAccount> listOfAccounts) {
		double max = 0;
		BankAccount match = null;
		for (BankAccount currentAccount : listOfAccounts) {
			if (currentAccount.getUserAmount() > max) {
				max = currentAccount.getUserAmount();
				match = currentAccount;
			}
		}
		System.out.println("Maximum  Account: \t" + listOfAccounts.get(listOfAccounts.indexOf(match)).toString());
	}

	public static String promptName() {

		System.out.println("Please enter the name to whom the account belongs. (Exit to Abort))");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		return name;
	}

	public static double promptAmount() {
		System.out.println("Please enter the amount of deposit");
		Scanner sc = new Scanner(System.in);
		double alpha = sc.nextDouble();
		return alpha;

	}

}
