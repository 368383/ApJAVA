package quarter1;

public class BankTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount = new BankAccount();

		myAccount.deposit(505.22);
		System.out.println(myAccount.getBalance());

		myAccount.withdrawl(100);
		System.out.println(myAccount.toString());

	}

}
