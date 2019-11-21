package quarter1;

public class Coin {
	private String face;
	private int flips = 0;

	public Coin(String inputFace) {
		face = inputFace;
	}

	public void getNumFlip() {
		System.out.println("Number of flips " + flips);
	}

	public void flip() {
		flips++;
		if (face.equals("T")) {
			face = "H";
		} else {
			face = "T";
		}
	}

	public boolean isHeads() {
		if (face.equals("H")) {
			return true;
		}
		return false;
	}

	public void getFace() {
		System.out.print(face + " ");
	}

}
