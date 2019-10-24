package projectX.banking;

public class BankingBackground {
	public static void encrypt(String fileName, BankAccount[] content) {
		Encryption.encrypt(fileName, content);
		Utility.prompt("File Encrypted");
	}

	public static void decrypt(String fileName) {
		//Encryption.decrypt(fileName);
		Utility.prompt("File Decrypted");
	}
}
