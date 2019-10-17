package projectX.banking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class BankSecurity {
	private boolean secureStatus = false;
	private int secure = 3;

	private int passwordCount = -1;
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
		passwordCount++;
		String entries[] = { "", "", "", "" };
		Scanner code = new Scanner(System.in);
		entries[passwordCount] = code.next();
		return entries[passwordCount];
	}

	public BankSecurity(boolean alpha) throws InterruptedException {
		while (true) {
			if (attempts == 3) {
				systemMessage = error1;
				secureStatus = true;
				break;
			}
			int max = secure;
			for (int i = 0; i < max + 1; i++) {
				String passCode = passwordRetrieval();
				if (secure == 0) {
					System.out.println("Logged in too many times. Please wait 5 minutes to try again");
					TimeUnit.MILLISECONDS.sleep(5000);
					secure = 3;
					attempts++;
					passwordCount = 0;
					secureStatus = false;
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
