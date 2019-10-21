package projectX.banking;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import bankPart2.BankAccount;

public class BankTools {
	private String firstName;
	private String lastName;
	private static ArrayList<BankAccountMain> customers = new ArrayList<BankAccountMain>();

	public BankTools() {
		String firstName = "guest";
		String lastName = "guest";
	}

	public BankTools(String inputFirstName, String inputLastName) {
		firstName = inputFirstName;
		lastName = inputLastName;
	}

	public BankAccountMain addAccount(String firstName, String lastName, int initial) {

		String name = firstName + " " + lastName;
		BankAccountMain newAccount = new BankAccountMain(name, initial);

		customers.add(newAccount);

		System.out.println("Balance " + newAccount.getBalance());
		return newAccount;

	}

	public static void write(String fileName) {
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