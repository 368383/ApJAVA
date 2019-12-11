package Q2.banking;

public class BankAccount {
	public String userName;
	public double userAmount;

	public double getUserAmount() {
		return userAmount;
	}

	public BankAccount(String name, double amount) {
		userName = name;
		userAmount = amount;
	}

	public void deposit(double depositAmount) {
		userAmount = userAmount + depositAmount;
	}

	public void withdraw(double withdrawAmount) {
		userAmount = userAmount - withdrawAmount;
	}

	public String toString() {
		return "Customer Name: " + userName + "\t | Customer Amount: " + Double.toString(userAmount);
	}
}
