package projectX.banking;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import bankPart2.BankAccount;

public class Encryption {
	private ArrayList<BankAccount2> encryptionHolder = new ArrayList<BankAccount2>();

	public ArrayList<BankAccount2> read(String fileName) {

		try {
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
}
