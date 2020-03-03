package Quarter3.oldMcDonald;

public class Chick extends Animal {
//	private String myType;
//	private String mySound;
	private String myType;
	private String mySound;

	Chick(String type, String sound) {
		myType = type;
		mySound = sound;
	}

	Chick(String type, String sound1, String sound2) {
		mySound = random(sound1, sound2);
		this.myType = type;
	}

	public String getSound() {
		return mySound;
	}

	public String getType() {
		return myType;
	}

	public String random(String option1, String option2) {
		int random = (int) (Math.random() * 2);
		System.out.println(random);

		if (random == 0) {
			return option1;
		}
		if (random == 1) {
			return option2;
		}
		return null;
	}
}
