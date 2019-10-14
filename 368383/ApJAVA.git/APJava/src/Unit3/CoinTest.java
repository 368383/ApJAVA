package Unit3;

public class CoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coin aCoin = new Coin();
		System.out.println(aCoin.toString());

		// flip the coin and output the new state
		aCoin.flip();
		System.out.println(aCoin.toString());

	}

}
