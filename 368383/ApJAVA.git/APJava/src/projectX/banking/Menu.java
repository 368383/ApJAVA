package projectX.banking;

public class Menu {

	private static final String addAccountMap = "A";
	private static final String modifyAccountMap = "M";
	private static String addAccount = " \n Add Account " + addAccountMap;
	private static String modifyAccount = " \n Modify Account " + modifyAccountMap;

	public static void main(String[] args) {
		String inputOption = Utility.prompt("Employee or User \n E for EMPLOYEE \n C for CUSTOMER");
		if (inputOption.equalsIgnoreCase("E")) {
			employeeMenu();
		} else {

		}
	}

	public static void employeeMenu() {
		// TODO Auto-generated method stub
		String baseInput = Utility.prompt("Please Select What You Would Like To Do: " + addAccount + modifyAccount)
				.toUpperCase();
		switch (baseInput) {
		case addAccountMap:
			Bank.adminAddTeller();
		case modifyAccountMap:
			
		}

	}
}
