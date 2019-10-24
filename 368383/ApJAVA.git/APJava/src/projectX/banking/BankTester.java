package projectX.banking;

public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount[] testArray;
		testArray = Utility.read("bank_account_2013.txt");

		Encryption.encryptTest("passwordFile.txt", 5, 4);

		Encryption.encrypt("fileDump.txt", testArray);

		//Encryption.decrypt("fileDump.txt");

	}

}
