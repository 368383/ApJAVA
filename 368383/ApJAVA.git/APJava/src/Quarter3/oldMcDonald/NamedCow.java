package Quarter3.oldMcDonald;

public class NamedCow extends Cow {
	private String name;

	NamedCow(String type, String sound, String name) {
		super(type, sound);
	}

	public String getName() {
		return name;
	}

}
