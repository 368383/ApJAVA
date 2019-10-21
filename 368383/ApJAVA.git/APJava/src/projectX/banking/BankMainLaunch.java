package projectX.banking;

import java.util.Scanner;

public class BankMainLaunch {
	private static BankSecurity securityStatus;

	public static void main(String[] args) throws InterruptedException {

		securityStatus = new BankSecurity();
		boolean isAuthorized = securityStatus.passwordChecker();
		if (isAuthorized == false) {
		} else {
			BankInterface.accountPrompt();
		}
		BankTools.write("projectX_listofAccounts.txt");
	}

}