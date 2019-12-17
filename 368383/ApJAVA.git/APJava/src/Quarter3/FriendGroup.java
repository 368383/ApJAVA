package Quarter3;

import java.util.ArrayList;

public class FriendGroup {
	ArrayList<Friend> friendList;
	public String[] levelList = { "best", "ultra", "great", "good", "acquaintance" };

	public FriendGroup() {
		friendList = new ArrayList<Friend>();
	}

	public void displayFriends() {
		for (Friend currentFriend : friendList) {
			System.out.println(currentFriend.toString());
		}
	}

	public void findFriend(String first) {
		if (friendList.contains(first)) {
			System.out.println(friendList.get(friendList.indexOf(first)).toString());
		} else {
			System.out.println("Friend does not exist");
		}
	}

	public void listFriends(int userLevel) {
		int i = 0;
		while (friendList.contains(userLevel)) {
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
		friendList.remove(friendList.indexOf(first));
	}

	public void removeAll(String userLevel) {
		int i = 0;
		while (friendList.contains(userLevel)) {
			String eval = friendList.get(i).toString();
			if (eval.contains(userLevel)) {
				friendList.remove(i);
			}
			i++;
		}
	}

	public boolean improvable(String first) {
		if (friendList.get(friendList.indexOf(first)).getlevel() == 4) {
			return false;
		} else {
			return true;
		}
	}

	public String improveFriend(String first) {
		if (improvable(first)) {
			return "unable to up";
		} else {
			friendList.get(friendList.indexOf(first)).improveFS();
			return friendList.get(friendList.indexOf(first)).toString();
		}
	}
}
