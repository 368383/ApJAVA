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

	private static int contentKey;
	private static int forKey;

	public static void encrypt(String targetFile, BankAccount[] array) {
		ArrayList<String> convertedBankAccount = new ArrayList<String>();
		for (BankAccount currentAccount : array) {
			convertedBankAccount.add(currentAccount.toFile());
		}

		ArrayList<Integer> encryptionHolder = new ArrayList<>();
		contentKey = keyGenerator();
		forKey = keyGenerator();
		int holder;
		for (String currentAccount : convertedBankAccount) {
			String content = currentAccount;
			byte[] ascii = content.getBytes(StandardCharsets.US_ASCII);
			for (int i = 0; i < ascii.length; i++) {
				holder = ascii[i] * ((int) Math.pow(contentKey, forKey));
				encryptionHolder.add(holder);
			}
		}
		System.out.println("Encryption holder countent " + encryptionHolder);
		Utility.writeIntegers(targetFile, encryptionHolder);
	}

	public static void encryptTest(String targetFile, int a, int b) {
		contentKey = a;
		forKey = b;
		int holder;
		ArrayList<Integer> testPassword = new ArrayList<Integer>();

		testPassword.add(a);
		testPassword.add(b);

		Utility.writeIntegers(targetFile, testPassword);
	}

//	public static void decrypt(String fileName) {
//		System.out.println("file name " + fileName);
//		String passwordFile = "passwordFile.txt";
//		String rawArray = Utility.readContent(fileName);
//		String key = Utility.readContent(passwordFile);
//
//		int contentkey = Integer.valueOf(key.get(0));
//		int forKey = Integer.valueOf(key.get(1));
//
//		ArrayList<Integer> decrypted = new ArrayList<Integer>();
//		for (String currentBlock : rawArray) {
//			decrypted.add(Math.floorDiv(Integer.valueOf(currentBlock), (int) Math.pow(contentKey, forKey)));
//		}
//		ArrayList<Byte> holder = new ArrayList<Byte>();
//		String[] array = holder.toArray(new String[holder.size()]);
//		for (String parsingAccount : array) {
//			String[] accountInfo = getInformation(parsingAccount);
//			String accountName = accountInfo[0];
//			double amount = Double.valueOf(accountInfo[1]);
//			System.out.println("Account number " + amount);
//			BankAccount account = new BankAccount(accountName, amount);
//		}
//	}

	public static String[] getInformation(String rawCustomerInfo) {
		int i = 0;
		while (true) {
			char atIndex = rawCustomerInfo.charAt(i);
			if (Character.isDigit(atIndex)) {
				String[] informationParsed = new String[1];
				informationParsed[0] = rawCustomerInfo.substring(0, i - 1);
				informationParsed[1] = rawCustomerInfo.substring(i);
				return informationParsed;
			}
			if (i == 100) {
				Utility.prompt("System Error");
				break;
			}
		}
		return null;
	}

	private ArrayList<Integer> getKey() {
		ArrayList<Integer> keyNumbers = new ArrayList<Integer>();
		keyNumbers.add(contentKey);
		keyNumbers.add(forKey);
		Utility.writeIntegers("passwordFile.txt", keyNumbers);
		return keyNumbers;
	}

	private static int keyGenerator() {
		int value = (int) (Math.random() * 5) + 1;
		return value;
	}
}
