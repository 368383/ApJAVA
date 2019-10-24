package projectX.banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

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

	public static BankAccount[] read(String fileName) {
		// TODO Auto-generated method stub
		BankAccount[] accounts = new BankAccount[20];
		System.out.println("Reading File from Java code");

		try {

			File file = new File(fileName);
			Scanner in = new Scanner(file);

			// Variable to hold the one line data
			String line;

			// Read file line by line and print on the console
			for (int i = 0; i < 20; i++) {
				String name = in.next();
				int bal = in.nextInt();
				// System.out.println(name + " " + bal);
				accounts[i] = new BankAccount(name, bal);
			}
			// Close the buffer reader
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accounts;

	}

	public static String readContent(String fileName) {
		System.out.println("Reading File from Java code");
		String line = "";
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(fileName));
			line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;

	}

	public static void writeStrings(String fileName, String[] informationArray) {

		try {
			BufferedWriter file = Files.newBufferedWriter(Paths.get(fileName));
			file.write("");
			for (String currentAccount : informationArray) {
				file.write(currentAccount);
			}
			file.flush();
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void writeIntegers(String fileName, ArrayList<Integer> informationArray) {
		System.out.println("Utility " + informationArray);

		try {
			BufferedWriter file = Files.newBufferedWriter(Paths.get(fileName));
			file.write("");
			for (Integer currentAccount : informationArray) {
				System.out.println("currentAccount " + currentAccount);
				file.write(currentAccount);
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
