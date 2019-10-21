package projectX.banking;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import bankPart2.BankAccount;

public class BankTools {
	private String firstName;
	private String lastName;
	private ArrayList<BankAccount2> customers = new ArrayList<BankAccount2>();

	public BankTools() {
		String firstName = "guest";
		String lastName = "guest";
	}

	public BankTools(String inputFirstName, String inputLastName) {
		firstName = inputFirstName;
		lastName = inputLastName;
	}

	public BankAccount2 addAccount(String firstName, String lastName, int initial) {

		String name = firstName + " " + lastName;
		BankAccount2 newAccount = new BankAccount2(name, initial);

		customers.add(newAccount);

		System.out.println("Balance " + newAccount.getBalance());
		return newAccount;

	}

	public void write(String fileName) {
		try {

			BufferedWriter file = Files.newBufferedWriter(Paths.get(fileName));
			file.write("");
			for (int i = 0; i < customers.size(); i++) {
				file.write(customers.get(i).toFile());
			}
			file.flush();
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}