package quarter1;

public class BankAccount {
	private double balance;
	private String name;

	public BankAccount() {
		balance = 0;
		name = "guest";
	}

	public BankAccount(String userName, double amount) {
		balance = amount;
		name = userName;
	}

	public void deposit(double in) {
		balance = balance + in;
	}

	public void withdrawl(double out) {
		balance = balance - out;
	}

	public String toString() {
		return "name " + name + " balance " + balance;
	}

	public double getBalance() {
		return balance;
	}
	
}
