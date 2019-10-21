package projectX.banking;

public class BankTeller {
	private String firstName;
	private String lastName;
	private String credentials;

	public BankTeller() {
		firstName = "guest";
		lastName = "guest";
		credentials = "default";
	}

	public BankTeller(String inputFirstName, String inputLastName, String inputCredentials) {
		firstName = inputFirstName;
		lastName = inputLastName;
		credentials = inputCredentials;
	}
	
	

}
