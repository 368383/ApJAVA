package Unit3;

public class CoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coin aCoin = new Coin();
		System.out.println(aCoin.toString());

		// flip the coin and output the new state
		aCoin.flip();

		System.out.println(aCoin.toString());

		Coin bCoin = new Coin(false);
		bCoin.flip();

		System.out.println("Value of coinB " + bCoin.toString());

		// generate a random number between 1 to 10

		double x = Math.random();
		int i = (int) (Math.random() * 10);
		System.out.println("Random number " + i);

		for (int l = 0; l < i; l++) {
			bCoin.flip();
			System.out.println("Current state " + bCoin.toString());

		}
		System.out.println("Value of coinB with final rnadom " + bCoin.toString());

	}

}
