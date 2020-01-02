package Quarter3;

import java.util.ArrayList;

public class FriendGroup {
	ArrayList<Friend> friendList;
	public String[] levelList = { "acquaintance", "good", "great", "ultra", "best" };

	public FriendGroup() {
		friendList = new ArrayList<Friend>();
	}

	public void displayFriends() {
		for (Friend currentFriend : friendList) {
			System.out.println(currentFriend.toString());
		}
	}

	public String findFriend(String first) {
		int i = 0;
		while (i < friendList.size()) {
			if (friendList.get(i).firstName.equals(first)) {
				return friendList.get(i).toString();
			}
			i++;
		}
		return "Friend does not exist";
	}

	public void listFriends(int userLevel) {
		System.out.println(levelList[userLevel] + "\t To be Evaluated");
		int i = 0;
		while (i < friendList.size()) {
			String eval = friendList.get(i).toString();
			if (eval.contains(levelList[userLevel])) {
				System.out.println(eval);
			}
			i++;
		}
	}

	public void addFriend(Friend aFriend) {
		friendList.add(aFriend);
	}

	public void addFriend(int index, Friend aFriend) {
		friendList.add(index, aFriend);
	}

	public void removeFriend(String first) {
		int i = 0;
		while (true) {
			if (friendList.get(i).firstName.equals(first)) {
				i = i - 1;
				break;
			}
			i++;
		}
		friendList.remove(i);
	}

	public void removeAll(int alpha) {
		String userLevel = levelList[alpha];
		int i = 0;
		while (i < friendList.size()) {
			String eval = friendList.get(i).toString();
			if (eval.contains(userLevel)) {
				System.out.println("REMOVAL INDEX " + friendList.get(i));
				friendList.remove(i);
				i = i - 1;
			}
			i++;
		}
	}

	public boolean improvable(String first) {
		int i = 0;
		while (true) {
			if (friendList.get(i).firstName.equals(first)) {
				break;
			}
			i++;
		}
		// System.out.println("IMPROVEMENT INDEX " + friendList.get(i).getlevel());
		if (friendList.get(i).getlevel() == 4) {
			return false;
		} else {
			return true;
		}
	}

	public String improveFriend(String first) {

		if (!improvable(first)) {
			return "unable to up";
		} else {
			int i = 0;

			while (true) {
				if (friendList.get(i).firstName.equals(first)) {
					break;
				}
				i++;
			}
			friendList.get(i).improveFS();
			return friendList.get(i).toString();
		}
	}
}
