package projectX.banking;

import java.util.ArrayList;

public class Bank {
	private static ArrayList<BankAccount> listofAccounts;
	public static String tellerFile = "tellersAccount.txt";
	private static ArrayList<BankTeller> tellers = new ArrayList<BankTeller>();

	public static void setTellers(ArrayList<BankTeller> tellers) {
		tellers = tellers;
	}

	public static ArrayList<BankTeller> getTellers() {
		return tellers;
	}

	public static BankTeller searchTellerList(String searchInput) {

		for (BankTeller currentTeller : tellers) {
			if (currentTeller.toString().contains(searchInput)) {
				return currentTeller;
			}
		}
		return null;
	}

	public static void modifyAccount() {

	}

	public static void addTeller() {
		BankTeller teller = new BankTeller();
		teller.setTellerInformation();
		Bank.addTellers(teller);
	}

	public static void adminAddTeller() {
		while (true) {
			addTeller();
			String inputOption = Utility
					.prompt("Would you like to continue adding accounts? \n Type in Y for YES  \n Type in N for NO");
			if (!inputOption.equalsIgnoreCase("Y")) {
				writeClass();
				break;
			}
		}
	}

	private static void addTellers(BankTeller teller) {
		tellers.add(teller);
	}

	private static void writeClass() {
		StringBuffer tellersString = new StringBuffer();
		for (BankTeller currentTeller : tellers) {
			tellersString.append(tellers.toString());
		}
		Utility.writeStrings(tellerFile, tellersString.toString());
	}

	public static ArrayList<BankAccount> getListofAccounts() {
		return listofAccounts;
	}

	public static void setListofAccounts(ArrayList<BankAccount> listofAccounts) {
		Bank.listofAccounts = listofAccounts;
	}

	public static void showBankAccounts() {
		System.out.println("LIST OF ALL ACCOUNTS");
		for (BankAccount currentAccount : listofAccounts) {
			System.out.println(currentAccount.toString());
		}
		Utility.printLine();
		System.out.println("Total Number of Accounts: " + listofAccounts.size());
	}
}
