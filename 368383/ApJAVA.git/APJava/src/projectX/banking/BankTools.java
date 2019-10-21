package projectX.banking;

public class BankTools {
	private String firstName;
	private String lastName;
	private BankAccount[] customers;
	private int totalCustomers = 0;

	public int getTotalCustomers() {
		return totalCustomers;
	}

	public BankTools() {
		String firstName = "guest";
		String lastName = "guest";
	}

	public BankTools(String inputFirstName, String inputLastName) {
		firstName = inputFirstName;
		lastName = inputLastName;
	}

	public BankAccount addAccount(String firstName, String lastName, int initial) {

		String name = firstName + " " + lastName;
		BankAccount newAccount = new BankAccount(name, initial);
		System.out.println("DEBUGGING INFORMATION "+ totalCustomers);
		
		customers[totalCustomers] = newAccount;

		System.out.println("Balance " + newAccount.getBalance());
		totalCustomers++;
		return newAccount;

	}

}