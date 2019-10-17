package projectX.banking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankSecurity {
	private boolean secureStatus = false;
	private int secure = 3;
	private boolean passwordEntry = true;
	private int passwordCount = 0;
	private String systemMessage = "default";
	private int attempts = 0;

	private String error1 = "Contact your administrator for password total reset.";

	public BankSecurity() {
		secureStatus = false;
	}

	public long currentTime() {
		long time;
		time = System.currentTimeMillis() / 1000;
		return time;
	}

	private String passwordRetrieval() {
		System.out.println("DEBUGGING INFORMATION - PASSWORDCOUNT VAR " + passwordCount);
		String entries[] = { "", "", "", "" };
		Scanner code = new Scanner(System.in);
		entries[passwordCount] = code.next();
		int index = passwordCount;
		passwordCount++;
		System.out.println("DEBUGGING INFORMATION - PASSWORDCOUNT INPUT " + entries[index]);
		return entries[index];

	}

	public BankSecurity(boolean alpha) throws InterruptedException {
		String passCode = "";
		while (true) {
			if (attempts == 2) {
				systemMessage = error1;
				secureStatus = false;
				break;
			}
			System.out.println("Please enter in your credentials");
			int max = secure;
			for (int i = 0; i < max + 1; i++) {
				passCode = passwordRetrieval();
				if (secure == 0) {
					System.out.println("Logged in too many times. Please wait 5 minutes to try again");
					TimeUnit.MILLISECONDS.sleep(5000);
					secure = 3;
					// attempts++;
					passwordCount = 0;
					secureStatus = false;
					continue;
				}
				if (passCode.equals("passcodeSample")) {
					secureStatus = true;
					systemMessage = "You have successfully logged in";
					break;
				} else {
					System.out.println("Invalid Code. Try again with " + (secure) + " times remaining");
					secureStatus = false;
					secure--;
				}
			}
		}

	}

	public String getSystemMessage() {
		return systemMessage;
	}

	public boolean getStatus() {
		return secureStatus;
	}

}
