package bankPart2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Banker {
	private String name;

	// OPTIONAL
	private BankAccount[] accounts;

	public BankAccount[] read(String fileName) {
		// TODO Auto-generated method stub
		accounts = new BankAccount[20];
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

	public void write(String fileName) {

		try {
			System.out.println("Writing file:" + accounts.length);
			BufferedWriter file = Files.newBufferedWriter(Paths.get(fileName));
			file.write("");
			for (BankAccount currentAccount : accounts) {
				file.write(currentAccount.toFile());
			}
			file.flush();
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String greeter(String name) {
		return "hello" + name;
	}
}
