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

	private static int forKey = 0;
	private static ArrayList<BankAccount> encryptionHolder = new ArrayList<BankAccount>();

	public static void encrypt() {

		// String convert = currentAccount.toFile();
		forKey = keyGenerator();
		System.out.println(forKey);
		byte[] ascii = "A".getBytes(StandardCharsets.US_ASCII);
		String asciiString = Arrays.toString(ascii);
		System.out.println(asciiString);

		float encryptedArray = Integer.valueOf(asciiString.substring(1, asciiString.length()-1)) * forKey;
		System.out.println(encryptedArray);
	}

	public static int keyGenerator() {
		int value = (int) (Math.random() * 100) + 1;
		return value;
	}
}
