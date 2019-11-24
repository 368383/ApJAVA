package quarter1;

public class coinLauncher {

	public static Coin[] coin = new Coin[500];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 500; i++) {
			coin[i] = new Coin("T");
		}
		System.out.println("LIST OF COINS");
		displayFace(coin);
		System.out.println("RADOM FLIP");
		randomFlip(coin);
		displayFace(coin);
		System.out.println("HEADS");
		countHeads(coin);
		System.out.println("DISPLAY FLIPS");
		displayFlips(coin);
		allHeads(coin);
		System.out.println("DISPLAY HEADS");
		displayFace(coin);
		System.out.println("DISPLAY FLIPS");
		displayFlips(coin);
		System.out.println("RADOM FLIP");
		randomFlip(coin);
		displayFace(coin);
		countHeads(coin);
		displayFlips(coin);
	}

	public static void randomFlip(Coin[] coin) {
		int randomIndex = random();
		System.out.println(randomIndex);

		for (int i = 0; i < coin.length; i++) {
			int flipMore = random();
			for (int l = 0; l < (randomIndex + flipMore); l++) {
				coin[i].flip();
			}

		}

	}

	private static int random() {
		return (int) (Math.random() * 10 + 1);
	}

	public static void displayFace(Coin[] coin) {
		int count = 0;
		for (Coin currentCoin : coin) {
			count++;
			currentCoin.getFace();
			count = count(count);
		}
	}

	public static void displayFlips(Coin[] coin) {
		int count = 0;
		for (Coin currentCoin : coin) {
			count++;
			currentCoin.getNumFlip();
			count = count(count);
		}
	}

	public static void countHeads(Coin[] coin) {
		int count = 0;
		int headCount = 0;
		for (Coin currentCoin : coin) {
			count++;

			if (currentCoin.isHeads() == true) {

				headCount++;
			}
			count = count(count);
		}
		System.out.println("head count " + headCount);

	}

	public static void allHeads(Coin[] coin) {

		for (Coin currentCoin : coin) {
			if (!currentCoin.isHeads()) {
				currentCoin.flip();
			}
		}
	}

	private static int count(int count) {
		if (count == 20) {
			count = 0;
			System.out.println();
		}
		return count;
	}

}
