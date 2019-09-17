package quarter1;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class rockPaperSisscors {

	public static void main(String[] args) {
		boolean con = true;
		int win = 0;
		int tie = 0;
		int loss = 0;
		while (con) {
			// TODO Auto-generated method stub
			System.out.println("1 for rock, 2 for paper, 3 for scissor | 0 for to stop");
			Scanner user = new Scanner(System.in);
			//
			int userInput = user.nextInt();
			int cpuInput = ThreadLocalRandom.current().nextInt(1, 3);
			//evaluation and deal with zero;
			if ((!(userInput == 0) && userInput < 1) || userInput > 3) {
				System.out.println("INVALD INPUT");
				continue;
			}
			if (!(userInput == 0) && userInput == cpuInput) {
				tie++;
				System.out.println("TIE" + " | Computer Input: " + cpuInput + " | Your Input " + userInput);
				continue;
			}
			if (!(userInput == 0) && userInput <= 2) {
				if (cpuInput == 1) {
					win++;
					System.out.println("WIN" + " | Computer Input: " + cpuInput + " | Your Input " + userInput);
				} else {
					loss++;
					System.out.println("LOSS" + " | Computer Input: " + cpuInput + " | Your Input " + userInput);
				}
			} else {
				if (userInput >= 2) {
					if (cpuInput == 1 && userInput == 3) {
						loss++;
						System.out.println("loss" + " | Computer Input: " + cpuInput + " | Your Input " + userInput);
					} else {
						win++;
						System.out.println("WIN" + " | Computer Input: " + cpuInput + " | Your Input " + userInput);
					}
				}
			}
			if (userInput == 0) {
				System.out.println("wins " + win);
				System.out.println("loss " + loss);
				System.out.println("tie " + tie);
				con = false;
				//break;
			}
		}

	}

}
