package projectX;

import java.util.Scanner;

public class BankSecurity {
	private boolean secureStatus = false;
	private int secure = 4;
	private long currentTime;
	private long lockOutTime = 0;
	private boolean checker = true;

	public BankSecurity() {
		secureStatus = false;
	}

	public long now() {
		long time;
		time = System.currentTimeMillis() / 1000;
		return time;
	}

	public BankSecurity(boolean alpha) {
		System.out.println("Security Engaged");
		while (checker) {
			currentTime = now();
			System.out.println("Difference " + (currentTime - lockOutTime));
			while (currentTime - lockOutTime > 5 && checker == true) {
				int max = secure;
				for (int i = 0; i < max + 1; i++) {
					Scanner code = new Scanner(System.in);
					String passCode = code.next();
					if (secure == 0) {
						System.out.println("Logged in too many times");
						secureStatus = false;
					}
					if (passCode.equals("passcodeSample")) {
						System.out.println("Passocde Matches");
						secureStatus = true;
						checker = false;
						System.out.println("done");
						break;
					} else {
						System.out.println("Invalid Code. Try again with " + secure + " times remaining");
						secureStatus = false;
						lockOutTime = System.currentTimeMillis() / 1000;
						System.out.println(lockOutTime);
						secure--;
					}
				}
			}
		}
	}

	public boolean getStatus() {
		return secureStatus;
	}

}
