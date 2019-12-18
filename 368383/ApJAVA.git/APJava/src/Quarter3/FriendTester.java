package Quarter3;

public class FriendTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendGroup homies = new FriendGroup();
		homies.addFriend(new Friend("Tim", "Roberts", 4));
		homies.addFriend(new Friend("Mary", "Roberts", 4));
		homies.addFriend(new Friend("Tom", "Roberts", 3));
		homies.addFriend(new Friend("Tam", "Roberts", 2));
		homies.addFriend(3, new Friend("Terry", "Roberts", 3));
		homies.addFriend(new Friend("Carrie", "Roberts", 1));
		;

		homies.displayFriends();
		homies.listFriends(2);
		System.out.println("ACTION IMPROVEMENT" + homies.improveFriend("Terry"));
		System.out.println("___________________________");

		homies.displayFriends();
		System.out.println("ACTION IMPROVEMENT" + homies.improveFriend("Carrie"));
		System.out.println("___________________________");

		homies.listFriends(2);
		homies.removeFriend("Mary");
		homies.listFriends(4);
		System.out.println("ACTION IMPROVEMENT" + homies.improveFriend("Terry"));
		System.out.println("___________________________");

		homies.removeAll(3);
		homies.displayFriends();
		System.out.println("ACTION FIND" + homies.findFriend("Tam"));

	}

}