package Quarter3.bankAccount;

public class SavingsAccount extends BankAccount {
	private int transactionNumber;
	private double interestRate;

	public SavingsAccount(String name, double balance, int transactionNumber, double interestRate) {
		super(balance, name);
		this.transactionNumber = transactionNumber;
		this.interestRate = interestRate;

	}

	public boolean checkTransActionNumber() {
		if (transactionNumber == 3) {
			return true;
		}
		return false;
	}

	public void deposit(double value) {
		super.deposit(value);
		transactionNumber++;
		if (!checkTransActionNumber()) {

		} else {
			transActionExceedMessage();
		}

	}

	private void transActionExceedMessage() {
		System.out.println("Unable to complete, exceeded transactionNumber");
	}

	public String toString() {
		return super.toString() + "interest Rate: " + interestRate + "\ttransactionNumber: " + transactionNumber;
	}

	public void addInterest() {
		double balance = super.getBalance();
		super.deposit(balance * interestRate);
		;
	}

	public void resetTransactionNumber() {
		transactionNumber = 0;
	}

	public void withdraw(double value) {
		// System.out.println("Transaction Number " + transactionNumber + "\t" +
		// (!checkTransActionNumber()));
		super.withdraw(value);
		transactionNumber++;
		if (!checkTransActionNumber()) {
		} else {
			transActionExceedMessage();
		}
	}

}
