package projectX.banking;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import bankPart2.BankAccount;

public class Utility {
	public static String prompt(String prompt) {
		System.out.println(prompt);
		Scanner scan = new Scanner(System.in);
		String value = scan.next();
		return value;
	}

	public static void debug(String prompt) {
		System.out.println("DEBUGGIN INFORMATION " + prompt);
	}

	public static BankAccountMain[] read(String fileName) {
		// TODO Auto-generated method stub
		BankAccountMain[] accounts = new BankAccountMain[20];
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
				accounts[i] = new BankAccountMain(name, bal);
			}
			// Close the buffer reader
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accounts;

	}

	public static void write(String fileName, ArrayList<BankAccountMain> storedArray) {

		try {
			BufferedWriter file = Files.newBufferedWriter(Paths.get(fileName));
			file.write("");
			for (BankAccountMain currentAccount : storedArray) {
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
