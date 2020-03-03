package Quarter3.oldMcDonald;

public class NamedCow extends Cow {
	private String name;

	NamedCow(String type, String name, String sound) {
		super(type, sound);
		this.name = name;

	}

	public String getName() {
		return name;
	}

}
