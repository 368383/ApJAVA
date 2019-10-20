package bankPart2;

import java.io.File;
import java.util.Scanner;

public class Banker {
	private String name;

	public BankAccount[] read(String fileName) {
		// TODO Auto-generated method stub
		BankAccount[] accounts = new BankAccount[20];
		System.out.println("Reading File from Java code");

		try {

			File file = new File(fileName);
			Scanner in = new Scanner(file);

			// Variable to hold the one line data
			String line;

			// Read file line by line and print on the console
			for (int i = 0; i < 100; i++) {
				String name = in.next();
				int bal = in.nextInt();
				// System.out.println(name + " " + bal);
				accounts[i] = new BankAccount(name, bal);
			}
			// Close the buffer reader
			in.close();
		} catch (Exception e) {
			System.out.println("Error while reading file line by line:" + e.getMessage());
		}
		return accounts;

	}

	public String greeter(String name) {
		return "hello" + name;
	}
}
