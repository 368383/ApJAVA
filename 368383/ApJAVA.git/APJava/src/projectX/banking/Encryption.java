package projectX.banking;

import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
	private static ArrayList<BankAccount> encryptionHolder = new ArrayList<BankAccount>();

	public static void encrypt() {
		// for (BankAccount currentAccount : encryptionHolder) {
		for (int i = 0; i < 1; i++) {
			// String convert = currentAccount.toFile();
			byte[] ascii = "BOB THE BUILDER".getBytes(StandardCharsets.US_ASCII);
			String asciiString = Arrays.toString(ascii);
			System.out.println(asciiString);
			long encryptedArray = Integer.valueOf(asciiString) * keyGenerator();

		}
	}

	public static int keyGenerator() {
		int value = (int) Math.random() * 100;
		return value;
	}
}
