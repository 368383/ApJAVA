package Unit3;

public class Coin {
	private boolean face; // heads true, tails is false

	public Coin() {
		face = true;
	}

	public Coin(boolean f) {
		face = f;
	}

	public void flip() {
		if (face == true) {
			face = false;
		} else {
			face = true;
		}
	}

	public boolean isheads() {
		return face;

	}

	public String toString() {
		if (face == true) {
			return "heads";
		} else {
			return "tails";
		}
	}
}
