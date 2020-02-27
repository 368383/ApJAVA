package Quarter3.bankAccount;

public class BankAccount {
	private  double balance;
	public  double getBalance() {
		return balance;
	}

	private  String name;

	public String getName() {
		return name;
	}

	public BankAccount(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public void deposit(double addedValue) {
		balance = balance + addedValue;
	}

	public void withdraw(double removeAmount) {
		balance = balance - removeAmount;
	}

	public String toString() {
		return "name <" + name + ">\tbalance<" + balance + ">";
	}

}
