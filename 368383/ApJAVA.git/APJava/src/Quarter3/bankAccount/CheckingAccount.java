package Quarter3.bankAccount;

public class CheckingAccount extends BankAccount {
//	- a constant TRANSACTION_FEE
//	 - override the constructor 
//	- override deposit to deduct fees
//	- override withdraw to deduct fees
//	- override toString 
	public  double transActionFee;

	public void setTransactionFee(double transactionFee) {
		this.transActionFee = transactionFee;
	}

	public CheckingAccount(String name, double balance, double trans) {
		super(balance, name);
		transActionFee=trans;
	}

	public void deposit(double value) {
		super.deposit(-1 * transActionFee + value);
	}

	public void withdraw(double value) {
		super.withdraw(transActionFee + value);
	}

	public String toString() {
		return super.toString() + "transActionFee; " + transActionFee;
	}
}
