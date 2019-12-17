package Quarter3;

public class Friend {
	public String firstName;
	public String lastName;
	public String userLevel;
	public int level;
	public String[] levelList = { "best", "ultra", "great", "good", "acquaintance" };

	public Friend(String firstName, String lastName, int level) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.level = level;
	}

	public String toString() {

		userLevel = levelList[level];
		return "Name: " + firstName + " " + lastName + "\tlevel:" + userLevel;
	}

	public void improveFS() {
		level++;
		userLevel = levelList[level];
	}

	public int getlevel() {
		return level;
	}
}
