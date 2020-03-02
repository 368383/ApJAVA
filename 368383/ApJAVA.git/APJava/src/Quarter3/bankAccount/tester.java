package Quarter3.bankAccount;

import java.io.File;
import java.util.Scanner;

public class tester {

	public static void main(String[] args) {

		BankAccount[] a = new BankAccount[10];
		SavingsAccount[] b = new SavingsAccount[10];
		CheckingAccount[] c = new CheckingAccount[10];
		read(a, b, c);
		int index = search("Addison", c);
		c[index].withdraw(100);
		c[index].deposit(50);
		System.out.println("PRINT OUT Addison: " + c[index].toString());

		int index1 = search("Albert", b);
		// System.out.println("Debug "+index1);

		for (int i = 0; i < 3; i++) {
			b[index1].withdraw(200);
		}
		b[index1].deposit(1000);
		b[index1].addInterest();
		System.out.println("PRINT OUT Albert: " + b[index1].toString());

		int index2 = search("Adonis", a);
		a[index2].deposit(5);
		System.out.println("PRINT OUT ADONIS: " + a[index2].toString());

		displayAccounts(a, b, c);

	}

	public static int search(String name, CheckingAccount[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getName().equals(name)) {
				return i;
			}
		}
		System.out.println("UNABLE TO BE FOUND");
		return 1000;
	}

	public static int search(String name, BankAccount[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getName().equals(name)) {
				return i;
			}
		}
		System.out.println("UNABLE TO BE FOUND");
		return 1000;
	}

	private static void read(BankAccount[] a, SavingsAccount[] b, CheckingAccount[] c) {
		try {
			Scanner input = new Scanner(new File("bank_account_saving_checking.txt"));

			input.nextLine();
			for (int i = 0; i < 10; i++) {
				String name = input.next();
				// System.out.println("Name " + name);
				int id = input.nextInt();
				a[i] = new BankAccount(id, name);
				input.nextLine();
				input.nextLine();
				input.nextLine();
			}
			input.close();

			Scanner input1 = new Scanner(new File("bank_account_saving_checking.txt"));

			input1.nextLine();

			for (int i = 0; i < 10; i++) {
				input1.nextLine();
				String name = input1.next();
				int id = input1.nextInt();
				double ir = input1.nextDouble();
				b[i] = new SavingsAccount(name, id, 0, ir);
				input1.nextLine();
				input1.nextLine();

			}
			input1.close();

			Scanner input2 = new Scanner(new File("bank_account_saving_checking.txt"));

			input2.nextLine();

			for (int i = 0; i < 10; i++) {
				input2.nextLine();
				input2.nextLine();
				String name = input2.next();
				System.out.println(name);
				int id = input2.nextInt();
				double ir = input2.nextDouble();
				c[i] = new CheckingAccount(name, id, ir);
				input2.nextLine();

			}
			input2.close();

		} catch (Exception e) {
			System.out.println("there is something wrong with reading");
		}
		// Output account arrays for debugging
		displayAccounts(a, b, c);
	}

	private static void displayAccounts(BankAccount[] a, SavingsAccount[] b, CheckingAccount[] c) {
		System.out.println("BANK ACCOUNTS");
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);

		}
		System.out.println("SAVINGS ACCOUNTS");

		for (int i = 0; i < 10; i++) {
			System.out.println(b[i]);

		}
		System.out.println("CHECKING ACCOUNTS");

		for (int i = 0; i < 10; i++) {
			System.out.println(c[i]);

		}
	}

}
